package com.dolojia.admin.manage.web;

import com.dolojia.admin.common.utils.PageUtils;
import com.dolojia.admin.common.utils.R;
import com.dolojia.admin.manage.entity.SysDictEntity;
import com.dolojia.admin.manage.service.SysDictService;
import com.dolojia.admin.manage.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 描述: 数据字典
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:04
 * E-mail: dolojia@gmail.com
 **/
@RestController
@RequestMapping("sys/dict")
public class SysDictController {
    @Autowired
    private SysDictService sysDictService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:dict:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = sysDictService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:dict:info")
    public R info(@PathVariable("id") Long id) {
        SysDictEntity dict = sysDictService.selectById(id);

        return R.ok().put("dict", dict);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:dict:save")
    public R save(@RequestBody SysDictEntity dict) {
        //校验类型
        ValidatorUtils.validateEntity(dict);

        sysDictService.insert(dict);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:dict:update")
    public R update(@RequestBody SysDictEntity dict) {
        //校验类型
        ValidatorUtils.validateEntity(dict);

        sysDictService.updateById(dict);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:dict:delete")
    public R delete(@RequestBody Long[] ids) {
        sysDictService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
