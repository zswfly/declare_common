package com.zsw.entitys.user;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by zhangshaowei on 2020/5/13.
 */
public class CompanyDto implements Serializable {

    private static final long serialVersionUID = -4669482850311161390L;

//    private Integer id;
//    private String name;
//    private Integer status;
//    private Timestamp createTime;
//    private Integer createUser;
//    private Timestamp updateTime;
//    private Integer updateUser;
//    private String url;
//    private String mnemonicCode;
//    private String contact;
//    private String contactPhone;

    private Integer id;
    private String name;
    private Integer status;
    private Timestamp createTime;
    private Integer createUser;
    private Timestamp updateTime;
    private Integer updateUser;
    private String url;
    private String mnemonicCode;
    private String contact;
    private String contactPhone;
    private String contactAddress;
    private Integer size;
    private Integer creatorId;
    private Date contractStartAt;
    private Date contractEndAt;
    private Integer managerId;

    public CompanyDto() {
    }


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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMnemonicCode() {
        return mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Date getContractStartAt() {
        return contractStartAt;
    }

    public void setContractStartAt(Date contractStartAt) {
        this.contractStartAt = contractStartAt;
    }

    public Date getContractEndAt() {
        return contractEndAt;
    }

    public void setContractEndAt(Date contractEndAt) {
        this.contractEndAt = contractEndAt;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}
