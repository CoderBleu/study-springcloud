package cn.coderblue.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author coderblue
 * @date 2021/1/8
 */
@SpringBootApplication
@EnableEurekaClient
// @EnableDiscoveryClient
// @ComponentScan(basePackageClasses = {cn.coderblue.springcloud.config.ApplicationContextConfig.class})
public class ConsumerOrderAppliction9012 {

    //@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration=MySelfRule.class)
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderAppliction9012.class, args);
    }
}
