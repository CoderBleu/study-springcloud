package cn.coderblue.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author coderblue
 * @create 2020-02-23 14:44
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosApplication9076 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosApplication9076.class, args);
    }
}
