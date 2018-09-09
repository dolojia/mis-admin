

package com.dolojia.admin.manage.service;


import com.baomidou.mybatisplus.service.IService;
import com.dolojia.admin.manage.entity.SysDeptEntity;

import java.util.List;
import java.util.Map;

/**
 * 描述: 部门管理
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:10
 * E-mail: dolojia@gmail.com
 **/
public interface SysDeptService extends IService<SysDeptEntity> {

    List<SysDeptEntity> queryList(Map<String, Object> map);

    /**
     * 查询子部门ID列表
     *
     * @param parentId 上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);

    /**
     * 获取子部门ID，用于数据过滤
     */
    List<Long> getSubDeptIdList(Long deptId);

}
