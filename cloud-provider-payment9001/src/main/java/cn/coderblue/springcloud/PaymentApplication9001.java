package cn.coderblue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author coderblue
 * @date 2021/1/7
 */
@SpringBootApplication
@EnableEurekaClient
// 服务发现
@EnableDiscoveryClient
public class PaymentApplication9001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication9001.class, args);
    }
}
