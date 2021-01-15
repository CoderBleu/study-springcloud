package cn.coderblue.springcloud.controller;

import cn.coderblue.springcloud.client.PaymentFeignClient;
import cn.coderblue.springcloud.entity.CommonResult;
import cn.coderblue.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author coderblue
 * @create 2020-02-20 0:05
 */
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignClient feignClient;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return feignClient.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // OpenFeign客户端一般默认等待1秒钟
        return feignClient.paymentFeignTimeout();
    }
}
