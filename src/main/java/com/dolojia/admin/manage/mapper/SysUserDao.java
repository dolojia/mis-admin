
package com.dolojia.admin.manage.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dolojia.admin.manage.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述: 系统用户
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:20
 * E-mail: dolojia@gmail.com
 **/
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

    /**
     * 查询用户的所有权限
     *
     * @param userId 用户ID
     */
    List<String> queryAllPerms(Long userId);

    /**
     * 查询用户的所有菜单ID
     */
    List<Long> queryAllMenuId(Long userId);

}
