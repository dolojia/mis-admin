
package com.dolojia.admin.manage.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dolojia.admin.manage.entity.SysRoleDeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 描述: 角色与部门对应关系
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:19
 * E-mail: dolojia@gmail.com
 **/
@Mapper
public interface SysRoleDeptDao extends BaseMapper<SysRoleDeptEntity> {

    /**
     * 根据角色ID，获取部门ID列表
     */
    List<Long> queryDeptIdList(Long[] roleIds);

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);
}
