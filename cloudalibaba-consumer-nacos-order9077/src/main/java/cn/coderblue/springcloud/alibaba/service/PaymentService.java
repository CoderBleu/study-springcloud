package cn.coderblue.springcloud.alibaba.service;


import cn.coderblue.springcloud.alibaba.service.impl.PaymentFallbackServiceImpl;
import cn.coderblue.springcloud.entity.CommonResult;
import cn.coderblue.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author coderblue
 * @create 2020-02-25 18:15
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackServiceImpl.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
