package com.iot.mvpdemo.model;

import com.android.volley.Response;
import com.iot.mvpdemo.base.Callback;
import com.iot.mvpdemo.callback.JsonCallback;
import com.iot.mvpdemo.model.base.BaseModel;
import com.iot.mvpdemo.model.bean.DeviceDataBean;
import com.iot.mvpdemo.model.bean.LoginBean;
import com.iot.mvpdemo.util.httpUtil.GsonRequest;
import com.lzy.okgo.OkGo;

import java.util.Map;

public class DeviceDataModel extends BaseModel<DeviceDataBean> {
    @Override
    public void execute(Callback<DeviceDataBean> callback) {

    }

    @Override
    public GsonRequest<DeviceDataBean> requestVolleyPostAPI(String url, Map params, Response.Listener<DeviceDataBean> listener, Response.ErrorListener errorListener) {
        return null;
    }

    @Override
    public void requestOKGOPost(Map params, JsonCallback<DeviceDataBean> callback) {
        OkGo.<LoginBean>post("https://www.easy-mock.com/mock/5cf27c783a77990337d059b8/example/getDeviceByEmpId")
                .tag(this)
                .params(params)
                .execute(callback);
    }
}
