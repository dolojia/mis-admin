package com.dolojia.admin.common.annotation;

import java.lang.annotation.*;


/**
 * 描述: 系统日志注解
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:25
 * E-mail: dolojia@gmail.com
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "";
}
