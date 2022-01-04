package com.dj.springcloud.alibaba.service;

import com.dj.springcloud.alibaba.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
