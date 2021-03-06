/**
 * @author 杜宇飞
 * @Description: 注册中心启动类
 * @date 2021年08月15日 -- 20:28
 * @cpoyright: ****科技有限公司
 ***/
package com.engineer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication.class, args);
    }
}
