package com.zsw.entitys.user;

import java.io.Serializable;

/**
 * Created by zhangshaowei on 2020/4/16.
 */
public class LoginTemp implements Serializable {

    private static final long serialVersionUID = -7989789760059218794L;

    private String phone;
    private String passWord;
    private String verifyType;
    private String verifyCode;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public LoginTemp() {
    }

    public LoginTemp(String phone, String passWord, String verifyType, String verifyCode) {
        this.phone = phone;
        this.passWord = passWord;
        this.verifyType = verifyType;
        this.verifyCode = verifyCode;
    }
}
