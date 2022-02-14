package com.xq.tmall.util;

import java.util.UUID;

/**
 * @Description:UUID工具类
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/1/9 21:24
 **/
public class UUIDUtil {

    /**
     * 生成UUID
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }

    /**
     * 生成四位的UUID
     * @return
     */
    public static String get4UUID(){
        String[] uuid= UUID.randomUUID().toString().split("-");
        return uuid[0];
    }

}
