package com.dj.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.dj.springcloud.entities.CommonResult;

public class CustomerBlockHandler
{
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }
    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler2");
    }
}