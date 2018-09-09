package com.dolojia.admin.common.redis;


/**
 * 描述: Redis所有Keys
 * 作者: dolojia
 * 修改日期: 2018/9/9 下午2:57
 * E-mail: dolojia@gmail.com
 **/
public class RedisKeys {

    public static String getSysConfigKey(String key) {
        return "sys:config:" + key;
    }

    public static String getShiroSessionKey(String key) {
        return "sessionid:" + key;
    }
}
