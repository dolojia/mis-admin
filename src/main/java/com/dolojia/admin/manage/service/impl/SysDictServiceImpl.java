package com.dolojia.admin.manage.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.dolojia.admin.common.utils.PageUtils;
import com.dolojia.admin.common.utils.Query;
import com.dolojia.admin.manage.entity.SysDictEntity;
import com.dolojia.admin.manage.service.SysDictService;
import com.dolojia.admin.manage.mapper.SysDictDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysDictService")
public class SysDictServiceImpl extends ServiceImpl<SysDictDao, SysDictEntity> implements SysDictService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String name = (String) params.get("name");

        Page<SysDictEntity> page = this.selectPage(
                new Query<SysDictEntity>(params).getPage(),
                new EntityWrapper<SysDictEntity>()
                        .like(StringUtils.isNotBlank(name), "name", name)
        );

        return new PageUtils(page);
    }

}
