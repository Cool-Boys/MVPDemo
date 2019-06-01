package com.iot.mvpdemo.model.base;

public class BaseBean {
    /**
     * count : 0
     * data :
     * errcode : -1
     * message : 密码不正确！
     */

    private int count;
    private int errcode;
    private String message;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
