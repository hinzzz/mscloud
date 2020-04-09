package com.hinz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：quanhz
 * @date ：Created in 2020/4/9 15:21
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8801 {
    public static void main(String[] args){
      SpringApplication.run(StreamMQMain8801.class,args);
    }
}
