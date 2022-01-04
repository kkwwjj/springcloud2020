package com.dj.springcloud.service.impl;


import com.dj.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import com.dj.springcloud.dao.PaymentDao;
import com.dj.springcloud.service.PaymentService;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymengById(Long id) {
        return paymentDao.getPaymengById(id);
    }
}
