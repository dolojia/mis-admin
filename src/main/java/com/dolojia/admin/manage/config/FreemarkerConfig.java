package com.dolojia.admin.manage.config;

import com.dolojia.admin.manage.shiro.ShiroTag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


/**
 * 描述: Freemarker配置
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午4:10
 * E-mail: dolojia@gmail.com
 **/
@Configuration
public class FreemarkerConfig {

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer(ShiroTag shiroTag) {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
        configurer.setTemplateLoaderPath("classpath:/templates");
        Map<String, Object> variables = new HashMap<>(1);
        variables.put("shiro", shiroTag);
        configurer.setFreemarkerVariables(variables);

        Properties settings = new Properties();
        settings.setProperty("default_encoding", "utf-8");
        settings.setProperty("number_format", "0.##");
        configurer.setFreemarkerSettings(settings);
        return configurer;
    }

}
