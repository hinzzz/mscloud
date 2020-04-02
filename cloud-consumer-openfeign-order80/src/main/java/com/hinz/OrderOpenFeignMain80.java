package com.hinz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：quanhz
 * @date ：Created in 2020/4/2 15:04
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignMain80 {
    public static void main(String[] args){
      SpringApplication.run(OrderOpenFeignMain80.class,args);
    }
}
