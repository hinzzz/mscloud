package com.hinz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：quanhz
 * @date ：Created in 2020/4/8 11:28
 */
@RequestMapping("/config")
@RefreshScope
@RestController
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get")
    public String get(){
        return "port : "+serverPort+"   configInfo : "+configInfo;
    }
}
