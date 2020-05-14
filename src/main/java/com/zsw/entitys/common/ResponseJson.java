package com.zsw.entitys.common;


/**
 * Created by zhangshaowei on 2020/4/11.
 */
public class ResponseJson {
    private Integer code;
    private Integer status;
    private String description;
    private Object data;
    private String message;

    public ResponseJson() {
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseJson(Integer code, Integer status, String description, Object data, String message) {
        this.code = code;
        this.status = status;
        this.description = description;
        this.data = data;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseJson{" + "code='" + code + '\'' + ", status=" + status + ", description='" + description + '\'' + ", data=" + data + ", message='" + message + '\'' + '}';
    }
}
