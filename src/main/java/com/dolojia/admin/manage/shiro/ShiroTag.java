package com.dolojia.admin.manage.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;


/**
 * 描述: Shiro权限标签
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午3:04
 * E-mail: dolojia@gmail.com
 **/
@Component
public class ShiroTag {

    /**
     * 是否拥有该权限
     *
     * @param permission 权限标识
     * @return true：是     false：否
     */
    public boolean hasPermission(String permission) {
        Subject subject = SecurityUtils.getSubject();
        return subject != null && subject.isPermitted(permission);
    }

}
