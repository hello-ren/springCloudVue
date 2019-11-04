package com.day.eurekaprovider.ren.model;

import java.util.Date;

public class Binding {
    private Integer binId;

    private Integer userId;

    private String binCategroy;

    private String binNumber;

    private String binPhone;

    private String binPwd;

    private String binAccount;

    private String binAccNum;

    private Date binTime;

    private Date binUnlinkTime;

    private String binInfo;

    public Binding(Integer binId, Integer userId, String binCategroy, String binNumber, String binPhone, String binPwd, String binAccount, String binAccNum, Date binTime, Date binUnlinkTime, String binInfo) {
        this.binId = binId;
        this.userId = userId;
        this.binCategroy = binCategroy;
        this.binNumber = binNumber;
        this.binPhone = binPhone;
        this.binPwd = binPwd;
        this.binAccount = binAccount;
        this.binAccNum = binAccNum;
        this.binTime = binTime;
        this.binUnlinkTime = binUnlinkTime;
        this.binInfo = binInfo;
    }

    public Binding() {
        super();
    }

    public Integer getBinId() {
        return binId;
    }

    public void setBinId(Integer binId) {
        this.binId = binId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBinCategroy() {
        return binCategroy;
    }

    public void setBinCategroy(String binCategroy) {
        this.binCategroy = binCategroy;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public String getBinPhone() {
        return binPhone;
    }

    public void setBinPhone(String binPhone) {
        this.binPhone = binPhone;
    }

    public String getBinPwd() {
        return binPwd;
    }

    public void setBinPwd(String binPwd) {
        this.binPwd = binPwd;
    }

    public String getBinAccount() {
        return binAccount;
    }

    public void setBinAccount(String binAccount) {
        this.binAccount = binAccount;
    }

    public String getBinAccNum() {
        return binAccNum;
    }

    public void setBinAccNum(String binAccNum) {
        this.binAccNum = binAccNum;
    }

    public Date getBinTime() {
        return binTime;
    }

    public void setBinTime(Date binTime) {
        this.binTime = binTime;
    }

    public Date getBinUnlinkTime() {
        return binUnlinkTime;
    }

    public void setBinUnlinkTime(Date binUnlinkTime) {
        this.binUnlinkTime = binUnlinkTime;
    }

    public String getBinInfo() {
        return binInfo;
    }

    public void setBinInfo(String binInfo) {
        this.binInfo = binInfo;
    }
}