package com.zsw.entitys.user;

import java.io.Serializable;

/**
 * Created by zhangshaowei on 2020/4/15.
 */
public class UserPermission implements Serializable {
    private static final long serialVersionUID = -1175880435480187325L;

    private Integer userId;
    public String permissionCode;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }
}
