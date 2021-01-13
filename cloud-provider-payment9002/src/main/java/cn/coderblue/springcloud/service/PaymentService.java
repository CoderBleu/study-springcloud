package cn.coderblue.springcloud.service;


import cn.coderblue.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author coderblue
 * @create 2020-02-18 10:40
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
