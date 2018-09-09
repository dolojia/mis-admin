
package com.dolojia.admin.manage.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dolojia.admin.manage.entity.SysConfigEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 描述: 系统配置信息
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:17
 * E-mail: dolojia@gmail.com
 **/
@Mapper
public interface SysConfigDao extends BaseMapper<SysConfigEntity> {

    /**
     * 根据key，查询value
     */
    SysConfigEntity queryByKey(String paramKey);

    /**
     * 根据key，更新value
     */
    int updateValueByKey(@Param("paramKey") String paramKey, @Param("paramValue") String paramValue);

}
