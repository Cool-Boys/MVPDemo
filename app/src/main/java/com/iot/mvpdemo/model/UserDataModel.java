package com.iot.mvpdemo.model;

import android.os.Handler;

import com.android.volley.Request;
import com.android.volley.Response;
import com.iot.mvpdemo.base.Callback;
import com.iot.mvpdemo.callback.JsonCallback;
import com.iot.mvpdemo.model.base.BaseModel;
import com.iot.mvpdemo.model.bean.DeviceSensorBean;
import com.iot.mvpdemo.model.bean.UserBean;
import com.iot.mvpdemo.util.httpUtil.GsonRequest;
import com.lzy.okgo.OkGo;

import java.util.Map;

public class UserDataModel extends BaseModel<UserBean> {



    @Override
    public void execute(final Callback<UserBean> callback) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // mParams 是从父类得到的请求参数
                switch (mParams[0]){
                    case "normal":
                        callback.onSuccess("UserDataModel根据参数"+mParams[0]+"的请求网络数据成功");
                        break;
                    case "failure":
                        callback.onFailure("请求失败：参数有误");
                        break;
                    case "error":
                        callback.onError();
                        break;
                }
                callback.onComplete();
            }
        },2000);
    }

    @Override
    public GsonRequest<UserBean> requestVolleyPostAPI(String url, Map params, Response.Listener<UserBean> listener, Response.ErrorListener errorListener) {
        GsonRequest<UserBean> gsonRequest = new GsonRequest<UserBean>(Request.Method.POST,
                params, url, UserBean.class, listener, errorListener
        );
      return gsonRequest;
    }
    @Override
    public void requestOKGOPost(Map params,JsonCallback<UserBean> callback){
        OkGo.<UserBean>post("https://www.easy-mock.com/mock/5cf27c783a77990337d059b8/example/getUserById")
                .tag(this)
                .params(params)
                .execute(callback);

    }


}
