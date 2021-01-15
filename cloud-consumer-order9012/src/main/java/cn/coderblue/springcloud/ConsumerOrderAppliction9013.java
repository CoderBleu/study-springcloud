package cn.coderblue.springcloud;


import cn.coderblue.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author coderblue
 * @date 2021/1/8
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
// @RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
public class ConsumerOrderAppliction9013 {

    //@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration=MySelfRule.class)
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderAppliction9013.class, args);
    }
}
