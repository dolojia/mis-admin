package com.dolojia.admin.manage.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dolojia.admin.common.utils.MapUtils;
import com.dolojia.admin.manage.entity.SysUserRoleEntity;
import com.dolojia.admin.manage.service.SysUserRoleService;
import com.dolojia.admin.manage.mapper.SysUserRoleDao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述: 用户与角色对应关系
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:41
 * E-mail: dolojia@gmail.com
 **/
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {
    @Override
    public void saveOrUpdate(Long userId, List<Long> roleIdList) {
        //先删除用户与角色关系
        this.deleteByMap(new MapUtils().put("user_id", userId));

        if (roleIdList == null || roleIdList.size() == 0) {
            return;
        }

        //保存用户与角色关系
        List<SysUserRoleEntity> list = new ArrayList<>(roleIdList.size());
        for (Long roleId : roleIdList) {
            SysUserRoleEntity sysUserRoleEntity = new SysUserRoleEntity();
            sysUserRoleEntity.setUserId(userId);
            sysUserRoleEntity.setRoleId(roleId);

            list.add(sysUserRoleEntity);
        }
        this.insertBatch(list);
    }

    @Override
    public List<Long> queryRoleIdList(Long userId) {
        return baseMapper.queryRoleIdList(userId);
    }

    @Override
    public int deleteBatch(Long[] roleIds) {
        return baseMapper.deleteBatch(roleIds);
    }
}
