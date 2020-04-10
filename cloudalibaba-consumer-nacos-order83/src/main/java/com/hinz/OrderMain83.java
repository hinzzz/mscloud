package com.hinz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：quanhz
 * @date ：Created in 2020/4/10 11:27
 */

@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain83 {
    public static void main(String[] args){
      SpringApplication.run(OrderMain83.class,args);
    }
}
