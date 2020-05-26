package com.zsw.utils;

import java.util.ArrayList;

/**
 * Created by zhangshaowei on 2020/4/17.
 */
public class CommonStaticWord {
    public  static  final String System_Url = "/system";

    public  static  final String CacheServices_Redis_VerifyCode_Type_LOGIN = "LOGIN";
    public  static  final String CacheServices_Redis_VerifyCode_Type_REST_PASSWORD = "REST_PASSWORD";

    public  static  final String HTTP = "http://";
    public  static  final String cacheServices = "cache-services";
    public  static  final String userServices = "user-services";
    public  static  final String orderServices = "order-services";
    public  static  final String messageServices = "message-services";


    /**
     * 正常
     */
    public  static  final int Normal_Status_0 = 0;

    /**
     * 失效 禁用
     */
    public  static  final int Ban_Status_1 = 1;


    /*
    *
    * 禁用字符串字段
    * */
    public  static  final String Status_enable = "enable";

    /*
     *
     * 启用字符串字段
     * */
    public  static  final String Status_ban = "ban";

    public  static  final ArrayList<String> sensitiveMetodName = getSensitiveMetodName();

    public  static ArrayList<String>  getSensitiveMetodName (){
        ArrayList<String> temp = new ArrayList();
        temp.add("login");
        temp.add("resetPassWord");
        return temp;
    }

}
