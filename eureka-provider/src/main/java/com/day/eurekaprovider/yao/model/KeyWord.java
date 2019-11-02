package com.day.eurekaprovider.yao.model;

import java.util.Date;

public class KeyWord {
    private Integer keyId;

    private Integer keyCid;

    private String keyNumber;

    private String keyFunction;

    private String keyHead;

    private String keyContent;

    private String keyFoot;

    private Date keyTime;

    private Integer keyCount;

    private String keyBack;

    private Integer keyState;

    private Date keyPtime;

    public KeyWord(Integer keyId, Integer keyCid, String keyNumber, String keyFunction, String keyHead, String keyContent, String keyFoot, Date keyTime, Integer keyCount, String keyBack, Integer keyState, Date keyPtime) {
        this.keyId = keyId;
        this.keyCid = keyCid;
        this.keyNumber = keyNumber;
        this.keyFunction = keyFunction;
        this.keyHead = keyHead;
        this.keyContent = keyContent;
        this.keyFoot = keyFoot;
        this.keyTime = keyTime;
        this.keyCount = keyCount;
        this.keyBack = keyBack;
        this.keyState = keyState;
        this.keyPtime = keyPtime;
    }

    public KeyWord() {
        super();
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public Integer getKeyCid() {
        return keyCid;
    }

    public void setKeyCid(Integer keyCid) {
        this.keyCid = keyCid;
    }

    public String getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(String keyNumber) {
        this.keyNumber = keyNumber;
    }

    public String getKeyFunction() {
        return keyFunction;
    }

    public void setKeyFunction(String keyFunction) {
        this.keyFunction = keyFunction;
    }

    public String getKeyHead() {
        return keyHead;
    }

    public void setKeyHead(String keyHead) {
        this.keyHead = keyHead;
    }

    public String getKeyContent() {
        return keyContent;
    }

    public void setKeyContent(String keyContent) {
        this.keyContent = keyContent;
    }

    public String getKeyFoot() {
        return keyFoot;
    }

    public void setKeyFoot(String keyFoot) {
        this.keyFoot = keyFoot;
    }

    public Date getKeyTime() {
        return keyTime;
    }

    public void setKeyTime(Date keyTime) {
        this.keyTime = keyTime;
    }

    public Integer getKeyCount() {
        return keyCount;
    }

    public void setKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
    }

    public String getKeyBack() {
        return keyBack;
    }

    public void setKeyBack(String keyBack) {
        this.keyBack = keyBack;
    }

    public Integer getKeyState() {
        return keyState;
    }

    public void setKeyState(Integer keyState) {
        this.keyState = keyState;
    }

    public Date getKeyPtime() {
        return keyPtime;
    }

    public void setKeyPtime(Date keyPtime) {
        this.keyPtime = keyPtime;
    }
}