package com.engineer.app;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 杜宇飞
 * @Description:
 * @date 2021年11月27日 -- 22:22
 * @cpoyright: 湖北软帝科技有限公司
 ***/

@EnableCaching
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.engineer.app")
@EnableFeignClients("com.engineer.app")
@ServletComponentScan("com.engineer.app")
@MapperScan(value = "com.engineer.app", annotationClass = Mapper.class)
public class DatabaseApplication {
    public static void main(String[] args) {

        SpringApplication.run(DatabaseApplication.class, args);
    }
}
