package com.iot.mvpdemo.callback;

import java.io.Serializable;

public class CustomResponse<T> implements Serializable {
    private static final long serialVersionUID = 5213230387175987834L;
    public int count;
    public int errcode;
    public String message;
    public T data;

    @Override
    public String toString() {
        return "LzyResponse{\n" +//
                "\tcount=" + count + "\n" +//
                "\tcode=" + errcode + "\n" +//
                "\tmsg='" + message + "\'\n" +//
                "\tdata=" + data + "\n" +//
                '}';
    }
}
