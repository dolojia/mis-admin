package com.dolojia.admin.common.xss;

import com.dolojia.admin.common.exception.RRException;
import org.apache.commons.lang3.StringUtils;

/**
 * 描述:  SQL过滤
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:30
 * E-mail: dolojia@gmail.com
 **/
public class SQLFilter {

    /**
     * SQL注入过滤
     *
     * @param str 待验证的字符串
     */
    public static String sqlInject(String str) {
        if (StringUtils.isBlank(str)) {
            return null;
        }
        //去掉'|"|;|\字符
        str = StringUtils.replace(str, "'", "");
        str = StringUtils.replace(str, "\"", "");
        str = StringUtils.replace(str, ";", "");
        str = StringUtils.replace(str, "\\", "");

        //转换成小写
        str = str.toLowerCase();

        //非法字符
        String[] keywords = {"master", "truncate", "insert", "select", "delete", "update", "declare", "alter", "drop"};

        //判断是否包含非法字符
        for (String keyword : keywords) {
            if (str.indexOf(keyword) != -1) {
                throw new RRException("包含非法字符");
            }
        }

        return str;
    }
}
