package com.zsw.entitys.common;

import java.util.Map;

/**
 * Created by zhangshaowei on 2020/4/11.
 */
public class ResponseJson {
    private String code;
    private Integer status;
    private String description;
    private Map data;

    public ResponseJson(String code, Integer status, String description, Map data) {
        this.code = code;
        this.status = status;
        this.description = description;
        this.data = data;
    }
    public ResponseJson() {
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseJson{" + "code='" + code + '\'' + ", status=" + status + ", description='" + description + '\'' + ", data=" + data + '}';
    }
}
