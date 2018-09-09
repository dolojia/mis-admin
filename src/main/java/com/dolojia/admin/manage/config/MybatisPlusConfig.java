package com.dolojia.admin.manage.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:mybatis-plus配置
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午4:10
 * E-mail: dolojia@gmail.com
 **/
@Configuration
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
