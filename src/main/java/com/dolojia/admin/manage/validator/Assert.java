package com.dolojia.admin.manage.validator;

import com.dolojia.admin.common.exception.RRException;
import org.springframework.util.StringUtils;

/**
* 描述: 数据校验
* 作者: dolojia
* 修改日期: 2018/9/9 下午1:59
* E-mail: dolojia@gmail.com
**/
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isEmpty(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
