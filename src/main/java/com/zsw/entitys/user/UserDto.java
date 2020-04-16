package com.zsw.entitys.user;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhangshaowei on 2020/4/16.
 */
public class UserDto implements Serializable{
    private static final long serialVersionUID = -8661001303607394006L;

    private Integer id;
    private String userName;
    private String phone;
    private String email;
    private String loginPwd;
    private Integer status;
    private String avatar;
    private Date createTime;
    private Integer createUser;
    private Date updateTime;
    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public UserDto() {
    }

    public UserDto(Integer id, String userName, String phone, String email, String loginPwd, Integer status, String avatar, Date createTime, Integer createUser, Date updateTime, Integer updateUser) {
        this.id = id;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.loginPwd = loginPwd;
        this.status = status;
        this.avatar = avatar;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }
}
