
package com.dolojia.admin.manage.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dolojia.admin.manage.entity.SysDeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述: 部门管理
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:17
 * E-mail: dolojia@gmail.com
 **/
@Mapper
public interface SysDeptDao extends BaseMapper<SysDeptEntity> {

    /**
     * 查询子部门ID列表
     *
     * @param parentId 上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);

}
