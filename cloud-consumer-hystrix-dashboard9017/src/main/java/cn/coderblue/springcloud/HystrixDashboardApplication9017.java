package cn.coderblue.springcloud;


import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * 微服务服务监控
 *
 * @author coderblue
 * @create 2020-02-20 22:02
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication9017 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication9017.class, args);
    }

}
