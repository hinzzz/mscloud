package com.hinz.controller;

import com.hinz.entities.CommonResult;
import com.hinz.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public CommonResult paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*******result:"+result);
        return new CommonResult(200,result);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public CommonResult paymentInfo_TimeOut(@PathVariable("id") Integer id){
        //int a = 10 / 0;
        paymentService.paymentInfo_TimeOut(id);
        return new CommonResult(200,"aaaaa");
    }





}
 
