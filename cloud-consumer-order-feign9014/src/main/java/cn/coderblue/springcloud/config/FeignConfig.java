package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author coderblue
 * @create 2020-02-20 9:40
 * 日志打印功能
 *
 * NONE: 默认的，不显示任何日志
 * BASIC：仅记录请求方法、URL、响应状态码及执行时间
 * HEADERS：除了BASIC中定义的信息之外，还有请求和响应的头信息
 * FULL：除了HEADERS中定义的信息之外，还有请求和响应的正文及元数据
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
