package com.hinz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：quanhz
 * @date ：Created in 2020/4/3 10:28
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderHystrixMain80 {
    public static void main(String[] args){
      SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
