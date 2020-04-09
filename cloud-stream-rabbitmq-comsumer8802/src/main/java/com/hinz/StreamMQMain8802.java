package com.hinz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：quanhz
 * @date ：Created in 2020/4/9 15:39
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8802 {
    public static void main(String[] args){
      SpringApplication.run(StreamMQMain8802.class,args);
    }
}
