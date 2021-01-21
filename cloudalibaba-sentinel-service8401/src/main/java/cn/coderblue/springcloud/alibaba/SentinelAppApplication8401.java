package cn.coderblue.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author coderblue
 * @create 2020-02-24 16:26
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelAppApplication8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelAppApplication8401.class, args);
    }
}
