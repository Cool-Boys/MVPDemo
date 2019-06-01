package com.iot.mvpdemo.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.iot.mvpdemo.presenter.base.BasePresenter;
import com.iot.mvpdemo.view.base.BaseView;

public  abstract class BaseActivity extends AppCompatActivity implements BaseView {
    private ProgressDialog mProgressDialog;
    /**
     * 获取Presenter实例，子类实现
     */
    public abstract BasePresenter getPresenter();
    /**
     * 初始化Presenter的实例，子类实现
     */
    public abstract void initPresenter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenter();
        if (getPresenter() != null){
            getPresenter().attachView(this);
        }
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCancelable(false);
    }

    @Override
    public void showLoading() {
        if (!mProgressDialog.isShowing()) {
            mProgressDialog.show();
        }
    }

    @Override
    public void hideLoading() {
        if (mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showErr(String msg) {
        showToast(msg);
    }


    @Override
    public Context getContext() {
        return BaseActivity.this;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (getPresenter() != null){
            getPresenter().detachView();
        }
    }

}
