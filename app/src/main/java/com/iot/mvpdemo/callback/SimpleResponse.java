package com.iot.mvpdemo.callback;

import java.io.Serializable;

public class SimpleResponse  implements Serializable {
    private static final long serialVersionUID = -1477609349345966116L;

    public int code;
    public String msg;

    public CustomResponse toLzyResponse() {
        CustomResponse response = new CustomResponse();
        response.errcode = code;
        response.message = msg;
        return response;
    }
}
