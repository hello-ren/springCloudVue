package com.day.eurekaprovider.ren.model;

import java.util.Date;

public class User {
    private Integer uId;

    private String uName;

    private String uSex;

    private String uWei;

    private Date uTime;

    private Date uCare;

    private Date uUncare;

    public User(Integer uId, String uName, String uSex, String uWei, Date uTime, Date uCare, Date uUncare) {
        this.uId = uId;
        this.uName = uName;
        this.uSex = uSex;
        this.uWei = uWei;
        this.uTime = uTime;
        this.uCare = uCare;
        this.uUncare = uUncare;
    }

    public User() {
        super();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuWei() {
        return uWei;
    }

    public void setuWei(String uWei) {
        this.uWei = uWei;
    }

    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    public Date getuCare() {
        return uCare;
    }

    public void setuCare(Date uCare) {
        this.uCare = uCare;
    }

    public Date getuUncare() {
        return uUncare;
    }

    public void setuUncare(Date uUncare) {
        this.uUncare = uUncare;
    }
}