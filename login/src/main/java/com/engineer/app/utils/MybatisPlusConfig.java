package com.enginer.app.utils;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author 杜宇飞
 * @Description: 配置分页插件
 * @date 2021年08月22日 -- 13:33
 * @cpoyright: 湖北软帝科技有限公司
 ***/

@Configuration
public class MybatisPlusConfig {

    //分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}