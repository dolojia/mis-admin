package com.dolojia.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages = {"com.dolojia.admin.manage.mapper"})
public class MisAdminApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MisAdminApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MisAdminApplication.class);
	}
}
