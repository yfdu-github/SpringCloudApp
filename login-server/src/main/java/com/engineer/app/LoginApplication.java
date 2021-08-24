package com.engineer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 杜宇飞
 * @Description: 登录服务启动类
 * @date 2021年08月15日 -- 20:28
 * @cpoyright: ****科技有限公司
 ***/

@EnableCaching
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan("com.engineer")
@ComponentScan("com.engineer")
@ServletComponentScan("com.engineer")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
