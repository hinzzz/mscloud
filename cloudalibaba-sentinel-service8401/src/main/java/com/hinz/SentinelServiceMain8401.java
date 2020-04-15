package com.hinz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.concurrent.TimeUnit;

/**
 * @author ：quanhz
 * @date ：Created in 2020/4/13 16:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceMain8401 {
    public static void main(String[] args){
        System.out.println("TimeUnit.SECONDS.toNanos(1) = " + TimeUnit.SECONDS.toNanos(1));
        SpringApplication.run(SentinelServiceMain8401.class,args);
    }
}
