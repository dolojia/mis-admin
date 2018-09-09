
package com.dolojia.admin.manage.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dolojia.admin.manage.entity.SysRoleMenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 描述: 角色与部门对应关系
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:19
 * E-mail: dolojia@gmail.com
 **/
@Mapper
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {

    /**
     * 根据角色ID，获取菜单ID列表
     */
    List<Long> queryMenuIdList(Long roleId);

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);
}
