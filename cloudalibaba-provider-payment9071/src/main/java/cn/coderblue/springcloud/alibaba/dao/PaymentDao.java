package cn.coderblue.springcloud.alibaba.dao;


import cn.coderblue.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author coderblue
 * @create 2020-02-18 10:27
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
