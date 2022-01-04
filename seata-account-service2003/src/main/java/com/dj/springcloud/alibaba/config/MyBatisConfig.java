package com.dj.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.dj.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
