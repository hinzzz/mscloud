package ratelimiter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class RateCounter implements RateLimiter {

    private static final int DEFAULT_RATE_LIMIT_PER_SECOND = Integer.MAX_VALUE;

    private int limit;

    private AtomicInteger counter;

    public RateCounter() {
        this(DEFAULT_RATE_LIMIT_PER_SECOND);
    }

    public RateCounter(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("limit less than zero");
        }
        this.limit = limit;
        counter = new AtomicInteger();
        TimestampHolder holder = new TimestampHolder();
        System.out.println("begin sec: " + holder.getTimestamp() / 1000L + ", mil: " + holder.getTimestamp() + " got a token");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            while (true) {
                long cur = System.currentTimeMillis();
                if (cur - holder.getTimestamp() >= 1000) {//当计数器数值超过阈值后，就拒绝余下请求。一秒钟后，我们将计数器清零，开始新一轮的计数
                    System.out.println("计算器清零 sec: " + cur / 1000L + ", mil: " + cur + " got a token");
                    holder.setTimestamp(cur);
                    counter.set(0);
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void acquire() {
        if (counter.incrementAndGet() > limit) {
            throw new RejectException();
        }
    }

    public static void main(String[] args) {
        RateLimiter rateLimiter = new RateCounter(10);

        int num = 100;
        while (num > 0) {
            try {
                rateLimiter.acquire();
            } catch (Exception e) {
                continue;
            }

            num--;
            System.out.println("sec: " + System.currentTimeMillis() / 1000L + ", mil: " + System.currentTimeMillis() + " got a token is : ");
        }
    }
}
