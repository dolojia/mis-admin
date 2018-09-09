package com.dolojia.admin.manage.service;

import com.baomidou.mybatisplus.service.IService;
import com.dolojia.admin.manage.entity.SysUserRoleEntity;

import java.util.List;


/**
 * 描述: 用户与角色对应关系
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:14
 * E-mail: dolojia@gmail.com
 **/
public interface SysUserRoleService extends IService<SysUserRoleEntity> {

    void saveOrUpdate(Long userId, List<Long> roleIdList);

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);
}
