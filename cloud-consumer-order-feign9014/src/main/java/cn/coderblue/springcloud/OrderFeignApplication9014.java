package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author coderblue
 * @create 2020-02-19 23:57
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignApplication9014
{
    public static void main(String[] args) {
            SpringApplication.run(OrderFeignApplication9014.class, args);
    }
}
