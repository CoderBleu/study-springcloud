package cn.coderblue.springcloud.mapper;


import cn.coderblue.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author coderblue
 * @create 2020-02-18 10:27
 */
@Mapper
public interface PaymentMapper {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
