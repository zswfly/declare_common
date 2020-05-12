package com.zsw.entitys.user;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by zhangshaowei on 2020/5/13.
 */
public class CompanyDto implements Serializable {

    private static final long serialVersionUID = -4669482850311161390L;

    private int id;
    private String name;
    private int status;
    private Timestamp createTime;
    private int createUser;
    private Timestamp updateTime;
    private int updateUser;
    private String url;
    private String mnemonicCode;
    private String contact;
    private String contactPhone;


    public CompanyDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public int getCreateUser() {
        return createUser;
    }

    public void setCreateUser(int createUser) {
        this.createUser = createUser;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public int getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(int updateUser) {
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
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

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    private String contactAddress;
    private int size;
    private int creatorId;
    private Date contractStartAt;
    private Date contractEndAt;
    private int managerId;



}
