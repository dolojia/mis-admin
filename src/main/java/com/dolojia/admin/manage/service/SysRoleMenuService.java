
package com.dolojia.admin.manage.service;

import com.baomidou.mybatisplus.service.IService;
import com.dolojia.admin.manage.entity.SysRoleMenuEntity;

import java.util.List;

/**
 * 描述: 角色与菜单对应关系
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:13
 * E-mail: dolojia@gmail.com
 **/
public interface SysRoleMenuService extends IService<SysRoleMenuEntity> {

    void saveOrUpdate(Long roleId, List<Long> menuIdList);

    /**
     * 根据角色ID，获取菜单ID列表
     */
    List<Long> queryMenuIdList(Long roleId);

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);

}
