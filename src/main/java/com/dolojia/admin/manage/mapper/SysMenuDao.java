
package com.dolojia.admin.manage.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dolojia.admin.manage.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述: 菜单管理
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:19
 * E-mail: dolojia@gmail.com
 **/
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {

    /**
     * 根据父菜单，查询子菜单
     *
     * @param parentId 父菜单ID
     */
    List<SysMenuEntity> queryListParentId(Long parentId);

    /**
     * 获取不包含按钮的菜单列表
     */
    List<SysMenuEntity> queryNotButtonList();

}
