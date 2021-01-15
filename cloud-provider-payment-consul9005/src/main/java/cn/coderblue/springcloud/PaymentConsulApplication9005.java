package cn.coderblue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author coderblue
 * @create 2020-02-19 16:05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulApplication9005 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulApplication9005.class, args);
    }
}
