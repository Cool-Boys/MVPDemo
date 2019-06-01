package com.iot.mvpdemo.presenter;

import com.iot.mvpdemo.base.DataModel;
import com.iot.mvpdemo.callback.JsonCallback;
import com.iot.mvpdemo.model.LoginDataModel;
import com.iot.mvpdemo.model.bean.LoginBean;
import com.iot.mvpdemo.presenter.base.BasePresenter;
import com.iot.mvpdemo.view.MvpView;

import java.util.Map;

public class LoginPresenter  extends BasePresenter<MvpView<LoginBean>> {
    public void getData(Map<String, String> params){
        //显示正在加载进度条
        if (!isViewAttached()) {
            //如果没有View引用就不加载数据
            return;
        }
        getView().showLoading();
        DataModel.request(LoginDataModel.class)
                .requestOKGOPost(params, new JsonCallback<LoginBean>() {

                    @Override
                    public void onError(com.lzy.okgo.model.Response<LoginBean> response) {
                        getView().showErr( response.body().getMessage());
                        if (isViewAttached()) {
                            getView().hideLoading();
                        }
                    }

                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<LoginBean> response) {

                        if (response.body().getErrcode() > -1) {
                            getView().setData(response.body());
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
