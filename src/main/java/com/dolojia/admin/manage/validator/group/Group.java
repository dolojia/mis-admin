package com.dolojia.admin.manage.validator.group;

import javax.validation.GroupSequence;

/**
 * 描述: 定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午3:03
 * E-mail: dolojia@gmail.com
 **/
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
