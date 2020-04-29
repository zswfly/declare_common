package com.zsw.entitys.user;

import java.io.Serializable;

/**
 * Created by zhangshaowei on 2020/4/29.
 */
public class SimpleCompanyDto implements Serializable {
    private static final long serialVersionUID = -3286454888927510525L;
    private Integer id;

    private String name;

    private Integer status;

    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SimpleCompanyDto(Integer id, String name, Integer status, String url) {

        this.id = id;
        this.name = name;
        this.status = status;
        this.url = url;
    }

    public SimpleCompanyDto() {

    }
}
