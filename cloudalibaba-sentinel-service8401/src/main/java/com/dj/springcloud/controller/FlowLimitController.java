package com.dj.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController
{

    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }

    @GetMapping("/testHosKey")
    @SentinelResource(value = "testHosKey",blockHandler = "deal_testHosKey")
    public String testHosKey(@RequestParam(value = "p1",required = false)String p1,
                             @RequestParam(value = "p2",required = false)String p2){
        return "--------testHosKey";
    }

    public  String deal_testHosKey(String p1, String p2, BlockException exception){
        //sentinel系统默认的提示：Blocked by Sentinel (flow limiting)
        return "--------deal_testHosKey";
    }
}