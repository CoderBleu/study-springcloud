package cn.coderblue.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author coderblue
 * @create 2020-02-23 14:12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentApplication9071 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9071.class, args);
    }
}
