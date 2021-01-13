package cn.coderblue.springcloud.service.impl;


import cn.coderblue.springcloud.entity.Payment;
import cn.coderblue.springcloud.mapper.PaymentMapper;
import cn.coderblue.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author coderblue
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
