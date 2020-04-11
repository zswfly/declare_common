package com.zsw.entitys.common;

import java.io.Serializable;

/**
 * Created by zhangshaowei on 2020/4/11.
 */
public class InitPermission implements Serializable {
    private static final long serialVersionUID = -7237462168230475448L;


    private String name;
    private String description;
    private String code;


    public InitPermission(String name, String description, String code) {
        this.name = name;
        this.description = description;
        this.code = code;
    }

    public InitPermission() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
