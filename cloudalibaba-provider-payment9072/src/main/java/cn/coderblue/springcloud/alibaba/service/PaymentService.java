package cn.coderblue.springcloud.alibaba.service;


import cn.coderblue.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author coderblue
 * @create 2020-02-18 10:40
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
