package com.bzz.common.utils;

/**
 * @Author : yang qianli
 * @email: 624003618@qq.com
 * @Date: 2019-二月-23 19-02
 * @Modified by:
 * @Description:
 */
public class ResponseData {

    /**
     * 返回2000代表正确信息
     */
    public final static String  RESPONE_CODE = "2000";

    /**
     * 返回2000代表错误信息
     */
    public final static String  RESPONE_CODE_ERROR = "2001";
    /**
     * 手机号不正确,或者已经被注册
     */
    public final static String  MOBILE_CODE_ERROR = "2002";
    /**
     * 邮箱不正确,或者已经被注册
     */
    public final static String  EMAIL_CODE_ERROR = "2003";
    /**
     * 登录名不正确,或者已经被注册
     */
    public final static String  NAME_CODE_ERROR = "2004";
    /**
     * 注册成功
     */
    public final static String  REGISTER_CODE = "2005";
    /**
     * 短信验证码错误
     */
    public final static String  SMS_CODE_ERROR = "2006";


    /**
     * 登录成功
     */
    public final static String  LOGIN_CODE = "3000";
    /**
     * 重复请求
     */
    public final static String  REQUEST_REPEAT_CODE = "3009";
    /**
     * 登录失败
     */
    public final static String  LOGIN_ERROR_CODE = "3001";
    /**
     * 账号没有找到
     */
    public final static String  USERNAME_NOT_FOUND = "3002";
    /**
     * 密码不正确
     */
    public final static String  PASSWORD_ERROR = "3004";
    /**
     * 账号过期,过期无法验证
     */
    public final static String  USERNAME_ACCOUNT_EXPIRED = "3005";
    /**
     * 账号被锁定
     */
    public final static String  USERNAME_ACCOUNT_LOCKED = "3006";
    /**
     * 密码或者凭证过期
     */
    public final static String  USERNAME_CREDENTIALS_EXPIRED = "3007";
    /**
     * 账号禁用
     */
    public final static String  USERNAME_ENABLED = "3008";
    /**
     * 账号没有客户端授权
     */
    public final static String  USER_ACCOUNT_NOUNAUTHORIZED = "401";
    /**
     * 账号没有客户端授权
     */
    public final static String  USER_CLIENT_NOUNAUTHORIZED = "4011";
    /**
     * 数据获取成功
     */
    public final static String  DATA_SECCUSS_CODE = "4001";
    /**
     * 数据获取失败
     */
    public final static String  DATA_FAIL_CODE = "4002";

    /**
     * 请求参数中有非法字段
     */
    public final static String  REQUEST_PARMARS_CODE = "4003";

}
