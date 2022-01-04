package com.dj.springcloud.service;

import com.dj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public  int create(Payment payment);

    public Payment getPaymengById(@Param("id") Long id);
}
