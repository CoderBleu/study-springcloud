package cn.coderblue.springcloud.service.impl;

import cn.coderblue.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author coderblue
 * @create 2020-02-20 18:22
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
