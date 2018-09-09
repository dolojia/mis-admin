package com.dolojia.admin.manage.web;

import com.dolojia.admin.common.utils.PageUtils;
import com.dolojia.admin.common.utils.R;
import com.dolojia.admin.manage.service.SysLogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 描述: 系统日志
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:04
 * E-mail: dolojia@gmail.com
 **/
@Controller
@RequestMapping("/sys/log")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    /**
     * 列表
     */
    @ResponseBody
    @RequestMapping("/list")
    @RequiresPermissions("sys:log:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = sysLogService.queryPage(params);

        return R.ok().put("page", page);
    }

}
