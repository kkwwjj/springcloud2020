package com.dj.springcloud.dao;



import com.dj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public  int create(Payment payment);

    public Payment getPaymengById(@Param("id") Long id);
}
