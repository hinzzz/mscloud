package com.hinz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：quanhz
 * @date ：Created in 2020/4/13 13:53
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class NacosConfigController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/get")
    public String get(){
        return "configInfo : "+configInfo;
    }
}
