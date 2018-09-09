
package com.dolojia.admin.manage.service;


import com.baomidou.mybatisplus.service.IService;
import com.dolojia.admin.common.utils.PageUtils;
import com.dolojia.admin.manage.entity.SysRoleEntity;

import java.util.Map;


/**
 * 描述: 角色
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:13
 * E-mail: dolojia@gmail.com
 **/
public interface SysRoleService extends IService<SysRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void save(SysRoleEntity role);

    void update(SysRoleEntity role);

    void deleteBatch(Long[] roleIds);

}
