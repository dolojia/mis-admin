
package com.dolojia.admin.manage.service;


import com.baomidou.mybatisplus.service.IService;
import com.dolojia.admin.common.utils.PageUtils;
import com.dolojia.admin.manage.entity.SysConfigEntity;

import java.util.Map;

/**
 * 描述: 系统配置信息
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:10
 * E-mail: dolojia@gmail.com
 **/
public interface SysConfigService extends IService<SysConfigEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存配置信息
     */
    public void save(SysConfigEntity config);

    /**
     * 更新配置信息
     */
    public void update(SysConfigEntity config);

    /**
     * 根据key，更新value
     */
    public void updateValueByKey(String key, String value);

    /**
     * 删除配置信息
     */
    public void deleteBatch(Long[] ids);

    /**
     * 根据key，获取配置的value值
     *
     * @param key key
     */
    public String getValue(String key);

    /**
     * 根据key，获取value的Object对象
     *
     * @param key   key
     * @param clazz Object对象
     */
    public <T> T getConfigObject(String key, Class<T> clazz);

}
