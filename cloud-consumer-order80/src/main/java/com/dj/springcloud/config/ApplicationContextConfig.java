package com.dj.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced     //使用注解赋予resttemlate负载均衡能力  使用自己写的算法不需要该注解
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
