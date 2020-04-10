package com.hinz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：quanhz
 * @date ：Created in 2020/4/10 10:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayMain9001 {
    public static void main(String[] args){
      SpringApplication.run(PayMain9001.class,args);
    }
}
