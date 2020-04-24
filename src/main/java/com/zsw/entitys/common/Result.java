package com.zsw.entitys.common;

/**
 * Created by zhangshaowei on 2020/4/25.
 */
public class Result<T> {
    private Integer code;
    private T data;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result() {
    }
}
