package com.dolojia.admin.manage.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dolojia.admin.manage.entity.SysRoleMenuEntity;
import com.dolojia.admin.manage.service.SysRoleMenuService;
import com.dolojia.admin.manage.mapper.SysRoleMenuDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * 描述: 角色与菜单对应关系
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:39
 * E-mail: dolojia@gmail.com
 **/
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveOrUpdate(Long roleId, List<Long> menuIdList) {
        //先删除角色与菜单关系
        deleteBatch(new Long[]{roleId});

        if (menuIdList.size() == 0) {
            return;
        }

        //保存角色与菜单关系
        List<SysRoleMenuEntity> list = new ArrayList<>(menuIdList.size());
        for (Long menuId : menuIdList) {
            SysRoleMenuEntity sysRoleMenuEntity = new SysRoleMenuEntity();
            sysRoleMenuEntity.setMenuId(menuId);
            sysRoleMenuEntity.setRoleId(roleId);

            list.add(sysRoleMenuEntity);
        }
        this.insertBatch(list);
    }

    @Override
    public List<Long> queryMenuIdList(Long roleId) {
        return baseMapper.queryMenuIdList(roleId);
    }

    @Override
    public int deleteBatch(Long[] roleIds) {
        return baseMapper.deleteBatch(roleIds);
    }

}
