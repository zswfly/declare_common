package com.zsw.entitys.user;

import java.io.Serializable;

/**
 * Created by zhangshaowei on 2020/4/11.
 */
public class InitPermission implements Serializable {
    private static final long serialVersionUID = -7237462168230475448L;


    private String name;
    private String description;
    private String code;
    private String url;


    public InitPermission(String name,  String code , String url , String description) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
