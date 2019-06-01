package com.iot.mvpdemo.view;

import com.iot.mvpdemo.view.base.BaseView;

public interface MvpView<T>  extends BaseView {
    void showData(String data);
     void setData(T data);
}
