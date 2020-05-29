package com.zsw.entitys.user;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhangshaowei on 2020/4/16.
 */
public class AdminUserDto implements Serializable{


    private static final long serialVersionUID = -3379872615014108138L;

    private Integer user_id;
    private Integer status;
    private Date createTime;
    private Integer createUser;
    private Date updateTime;
    private Integer updateUser;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public AdminUserDto() {
    }
}
