package com.dolojia.admin.manage.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dolojia.admin.manage.entity.SysUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 描述: 用户与角色对应关系
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:20
 * E-mail: dolojia@gmail.com
 **/
@Mapper
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);
}
