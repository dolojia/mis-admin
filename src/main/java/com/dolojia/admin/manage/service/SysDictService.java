
package com.dolojia.admin.manage.service;

import com.baomidou.mybatisplus.service.IService;
import com.dolojia.admin.common.utils.PageUtils;
import com.dolojia.admin.manage.entity.SysDictEntity;

import java.util.Map;


/**
 * 描述: 部门管理
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:10
 * E-mail: dolojia@gmail.com
 **/
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

