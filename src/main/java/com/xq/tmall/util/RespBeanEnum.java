package com.xq.tmall.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Description:公共返回对象枚举
 * @Author：dongRuiLong
 * @Date 创建时间： 2022/1/1 20:56
 **/

@ToString
@Getter
@AllArgsConstructor
public enum  RespBeanEnum {

    /**
     * 通用
     */
    SUCCESS(200,"SUCCESS"),
    ERROR(500,"服务端异常"),
    /**
     * 登录模块，5002xx
     */
    LOGIN_ERROR(500210,"用户名或密码错误"),
    MOBILE_ERROR(500211,"手机号码格式不正确"),
    SESSION_ERROR(500212,"用户不存在"),

    /**
     * 秒杀模块，5005xx
     */
    EMPTY_STOCK(500500,"库存不足"),
    REPETE_ERROR(500501,"重复抢购"),
    REQUEST_ILLEGAL(500502,"请求非法，请重新尝试"),
    ERROR_CAPTCHA(500503,"验证码错误"),
    ACCESS_LIMIT_REACHED(500504,"您的访问过于频繁，请稍后再试"),

    /**
     * 订单模块，5006xx
     */
    ORDER_NOT_EXIST(500600,"订单信息不存在"),

    /**
     * new idea模块，5007xx
     */
    EMPTY_FILE(500701,"上传文件为空，请重新上传"),
    ERROR_FILE(500702,"上传文件异常");

    private final Integer code;
    private final String message;
}
