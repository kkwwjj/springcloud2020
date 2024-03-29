package com.dj.springcloud.controller;


import com.dj.springcloud.entities.CommonResult;
import com.dj.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.dj.springcloud.service.PaymentService;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入结果"+result);

        if (result>0){
            return new CommonResult(200,"插入成功,serverPort:"+serverPort,result);
        }else {
            return  new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymengById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymengById(id);
        log.info("*******查询结果"+payment);

        if (payment != null){
            return new CommonResult(200,"查询成功,serverPort"+serverPort,payment);
        }else {
            return  new CommonResult(444,"没有对应记录,查询id："+id,null);
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLb(){
        return  serverPort;
    }


}
