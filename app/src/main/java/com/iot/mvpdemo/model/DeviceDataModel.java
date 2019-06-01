package com.iot.mvpdemo.model;

import com.android.volley.Response;
import com.iot.mvpdemo.base.Callback;
import com.iot.mvpdemo.callback.JsonCallback;
import com.iot.mvpdemo.model.base.BaseModel;
import com.iot.mvpdemo.model.bean.DeviceByEmpIdBean;
import com.iot.mvpdemo.model.bean.LoginBean;
import com.iot.mvpdemo.util.httpUtil.GsonRequest;
import com.lzy.okgo.OkGo;

import java.util.Map;

public class DeviceDataModel extends BaseModel<DeviceByEmpIdBean> {
    @Override
    public void execute(Callback<DeviceByEmpIdBean> callback) {

    }

    @Override
    public GsonRequest<DeviceByEmpIdBean> requestVolleyPostAPI(String url, Map params, Response.Listener<DeviceByEmpIdBean> listener, Response.ErrorListener errorListener) {
        return null;
    }

    @Override
    public void requestOKGOPost(Map params, JsonCallback<DeviceByEmpIdBean> callback) {
        OkGo.<LoginBean>post("https://www.easy-mock.com/mock/5cf27c783a77990337d059b8/example/getDeviceByEmpId")
                .tag(this)
                .params(params)
                .execute(callback);
    }
}
