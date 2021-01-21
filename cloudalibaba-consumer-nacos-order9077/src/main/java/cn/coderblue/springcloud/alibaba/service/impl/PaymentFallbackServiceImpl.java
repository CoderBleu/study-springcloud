package cn.coderblue.springcloud.alibaba.service.impl;


import cn.coderblue.springcloud.alibaba.service.PaymentService;
import cn.coderblue.springcloud.entity.CommonResult;
import cn.coderblue.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @author coderblue
 * @create 2020-02-25 18:30
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackServiceImpl", new Payment(id, "errorSerial"));
    }
}
