package cn.coderblue.springcloud.client.impl;

import cn.coderblue.springcloud.client.PaymentFeignClient;
import cn.coderblue.springcloud.entity.CommonResult;
import cn.coderblue.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @author coderblue
 * @date 2021/1/15
 * 熔断器
 */
@Component
public class PaymentFeignDegrade implements PaymentFeignClient {
    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return new CommonResult(500, "getPaymentById-获取信息失败");
    }

    @Override
    public String paymentFeignTimeout() {
        return "paymentFeignTimeout - 获取信息失败";
    }
}
