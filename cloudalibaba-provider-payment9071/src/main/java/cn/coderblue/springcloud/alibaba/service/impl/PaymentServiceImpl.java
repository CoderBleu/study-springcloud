package cn.coderblue.springcloud.alibaba.service.impl;


import cn.coderblue.springcloud.alibaba.dao.PaymentDao;
import cn.coderblue.springcloud.alibaba.service.PaymentService;
import cn.coderblue.springcloud.entity.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
