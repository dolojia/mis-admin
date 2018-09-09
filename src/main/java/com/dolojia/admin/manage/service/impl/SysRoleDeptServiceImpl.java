package com.dolojia.admin.manage.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dolojia.admin.manage.entity.SysRoleDeptEntity;
import com.dolojia.admin.manage.service.SysRoleDeptService;
import com.dolojia.admin.manage.mapper.SysRoleDeptDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * 描述: 角色与部门对应关系
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:39
 * E-mail: dolojia@gmail.com
 **/
@Service("sysRoleDeptService")
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptDao, SysRoleDeptEntity> implements SysRoleDeptService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveOrUpdate(Long roleId, List<Long> deptIdList) {
        //先删除角色与部门关系
        deleteBatch(new Long[]{roleId});

        if (deptIdList.size() == 0) {
            return;
        }

        //保存角色与菜单关系
        List<SysRoleDeptEntity> list = new ArrayList<>(deptIdList.size());
        for (Long deptId : deptIdList) {
            SysRoleDeptEntity sysRoleDeptEntity = new SysRoleDeptEntity();
            sysRoleDeptEntity.setDeptId(deptId);
            sysRoleDeptEntity.setRoleId(roleId);

            list.add(sysRoleDeptEntity);
        }
        this.insertBatch(list);
    }

    @Override
    public List<Long> queryDeptIdList(Long[] roleIds) {
        return baseMapper.queryDeptIdList(roleIds);
    }

    @Override
    public int deleteBatch(Long[] roleIds) {
        return baseMapper.deleteBatch(roleIds);
    }
}
