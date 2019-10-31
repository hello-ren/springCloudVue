package com.day.eurekaprovider.ren.model;

import java.util.Date;

public class Notice {
    private Integer noId;

    private Integer noUserId;

    private String noFromUser;

    private String noCategroy;

    private Integer noState;

    private String noReminder;

    private String noBack;

    private Date noTime;

    private String noOne;

    private String noTwo;

    private String noThree;

    public Notice(Integer noId, Integer noUserId, String noFromUser, String noCategroy, Integer noState, String noReminder, String noBack, Date noTime, String noOne, String noTwo, String noThree) {
        this.noId = noId;
        this.noUserId = noUserId;
        this.noFromUser = noFromUser;
        this.noCategroy = noCategroy;
        this.noState = noState;
        this.noReminder = noReminder;
        this.noBack = noBack;
        this.noTime = noTime;
        this.noOne = noOne;
        this.noTwo = noTwo;
        this.noThree = noThree;
    }

    public Notice() {
        super();
    }

    public Integer getNoId() {
        return noId;
    }

    public void setNoId(Integer noId) {
        this.noId = noId;
    }

    public Integer getNoUserId() {
        return noUserId;
    }

    public void setNoUserId(Integer noUserId) {
        this.noUserId = noUserId;
    }

    public String getNoFromUser() {
        return noFromUser;
    }

    public void setNoFromUser(String noFromUser) {
        this.noFromUser = noFromUser;
    }

    public String getNoCategroy() {
        return noCategroy;
    }

    public void setNoCategroy(String noCategroy) {
        this.noCategroy = noCategroy;
    }

    public Integer getNoState() {
        return noState;
    }

    public void setNoState(Integer noState) {
        this.noState = noState;
    }

    public String getNoReminder() {
        return noReminder;
    }

    public void setNoReminder(String noReminder) {
        this.noReminder = noReminder;
    }

    public String getNoBack() {
        return noBack;
    }

    public void setNoBack(String noBack) {
        this.noBack = noBack;
    }

    public Date getNoTime() {
        return noTime;
    }

    public void setNoTime(Date noTime) {
        this.noTime = noTime;
    }

    public String getNoOne() {
        return noOne;
    }

    public void setNoOne(String noOne) {
        this.noOne = noOne;
    }

    public String getNoTwo() {
        return noTwo;
    }

    public void setNoTwo(String noTwo) {
        this.noTwo = noTwo;
    }

    public String getNoThree() {
        return noThree;
    }

    public void setNoThree(String noThree) {
        this.noThree = noThree;
    }
}