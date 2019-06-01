package com.iot.mvpdemo.presenter;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.iot.mvpdemo.base.Callback;
import com.iot.mvpdemo.base.DataModel;
import com.iot.mvpdemo.callback.JsonCallback;
import com.iot.mvpdemo.model.UserDataModel;
import com.iot.mvpdemo.model.bean.UserBean;
import com.iot.mvpdemo.presenter.base.BasePresenter;
import com.iot.mvpdemo.util.httpUtil.GsonRequest;
import com.iot.mvpdemo.view.MvpView;

import java.util.Map;

public class MvpPresenter extends BasePresenter<MvpView> {

    /**
     * 获取网络数据
     *
     * @param params 参数
     */
    public void getData(String params) {
        //显示正在加载进度条
        if (!isViewAttached()) {
            //如果没有View引用就不加载数据
            return;
        }
        getView().showLoading();
        DataModel
                // 设置请求标识token
                .request(UserDataModel.class)
                // 添加请求参数，没有则不添加
                .params(params)
                // 注册监听回调
                .execute(new Callback<String>() {
                    @Override
                    public void onSuccess(String data) {
                        //调用view接口显示数据
                        getView().showData(data);
                    }

                    @Override
                    public void onFailure(String msg) {
                        //调用view接口提示失败信息
                        if (isViewAttached()) {
                            getView().showToast(msg);
                        }
                    }

                    @Override
                    public void onError() {
                        //调用view接口提示请求异常
                        if (isViewAttached()) {
                            getView().showErr("111");
                        }
                    }

                    @Override
                    public void onComplete() {
                        // 隐藏正在加载进度条
                        if (isViewAttached()) {
                            getView().hideLoading();
                        }
                    }
                });
    }


    public GsonRequest<UserBean> getUserData(Map<String, String> params) {
        //显示正在加载进度条
        if (!isViewAttached()) {
            //如果没有View引用就不加载数据
            return null;
        }
        getView().showLoading();
        GsonRequest<UserBean> request = DataModel
                // 设置请求标识token
                .request(UserDataModel.class)
                .requestVolleyPostAPI("http://183.230.11.41:62011/iot/system/user/getUserById.shtml", params, new Response.Listener<UserBean>() {
                    @Override
                    public void onResponse(UserBean response) {
                        if (response.getErrcode() > -1) {
                            getView().showData("用户名称:" + response.getData().getSNAME());
                        } else {
                            if (isViewAttached()) {
                                getView().showToast(response.getMessage());
                            }
                        }
                        if (isViewAttached()) {
                            getView().hideLoading();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        getView().showErr(error.getMessage());
                        if (isViewAttached()) {
                            getView().hideLoading();
                        }
                    }
                });
        return request;
    }

    public void getUserData2(Map<String, String> params){
        //显示正在加载进度条
        if (!isViewAttached()) {
            //如果没有View引用就不加载数据
            return;
        }
        getView().showLoading();
        DataModel.request(UserDataModel.class)
                .requestOKGOPost(params, new JsonCallback<UserBean>() {

                    @Override
                    public void onError(com.lzy.okgo.model.Response<UserBean> response) {
                        getView().showErr(response.body().getMessage());
                        if (isViewAttached()) {
                            getView().hideLoading();
                        }
                    }

                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<UserBean> response) {

                        if (response.body().getErrcode() > -1) {
                            getView().showData("requestOKGOPost用户名称:" + response.body().getData().getSNAME());
                        } else {
                            if (isViewAttached()) {
                                getView().showToast(response.body().getMessage());
                            }
                        }
                        if (isViewAttached()) {
                            getView().hideLoading();
                        }
                    }


                });
    }

}
