package com.dolojia.admin.manage.web;

import com.dolojia.admin.manage.entity.SysUserEntity;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
* 描述: Controller公共组件
* 作者: dolojia
* 修改日期: 2018/9/9 下午2:05
* E-mail: dolojia@gmail.com
**/
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		return (SysUserEntity) SecurityUtils.getSubject().getPrincipal();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}

	protected Long getDeptId() {
		return getUser().getDeptId();
	}
}
