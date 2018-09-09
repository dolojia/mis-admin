package com.dolojia.admin.manage.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* 描述: 系统页面视图
* 作者: dolojia
* 修改日期: 2018/9/9 下午2:03
* E-mail: dolojia@gmail.com
**/
@Controller
public class SysPageController {
	
	@RequestMapping("modules/{module}/{url}.html")
	public String module(@PathVariable("module") String module, @PathVariable("url") String url){
		return "modules/" + module + "/" + url;
	}

	@RequestMapping(value = {"/", "index.html"})
	public String index(){
		return "index";
	}

	@RequestMapping("index1.html")
	public String index1(){
		return "index1";
	}

	@RequestMapping("login.html")
	public String login(){
		return "login";
	}

	@RequestMapping("main.html")
	public String main(){
		return "main";
	}

	@RequestMapping("404.html")
	public String notFound(){
		return "404";
	}

}
