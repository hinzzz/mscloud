package com.hinz.controller;

import com.hinz.entities.CommonResult;
import com.hinz.entities.Payment;
import com.hinz.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
       return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/testMap")
    public CommonResult testMap(){
        Map<String,String> map = new HashMap<>();
        map.put("1","A");
        map.put("2","C");
        map.put("3","cfff");
        return paymentFeignService.testMap(map);
    }
}
 
 
