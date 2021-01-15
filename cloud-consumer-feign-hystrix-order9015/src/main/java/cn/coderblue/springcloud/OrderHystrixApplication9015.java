package cn.coderblue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author coderblue
 * @create 2020-02-20 11:55
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixApplication9015
{
    public static void main(String[] args)
    {
        SpringApplication.run(OrderHystrixApplication9015.class,args);
    }
}
