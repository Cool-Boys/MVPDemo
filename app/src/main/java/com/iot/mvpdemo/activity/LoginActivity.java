package com.iot.mvpdemo.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.iot.mvpdemo.MainActivity;
import com.iot.mvpdemo.R;
import com.iot.mvpdemo.base.BaseActivity;
import com.iot.mvpdemo.model.bean.LoginBean;
import com.iot.mvpdemo.presenter.LoginPresenter;
import com.iot.mvpdemo.presenter.base.BasePresenter;
import com.iot.mvpdemo.view.MvpView;
import com.iot.mvpdemo.widget.EditTextClearTools;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements MvpView<LoginBean> {

    @BindView(R.id.textView1)
    TextView textView1;
    @BindView(R.id.view1)
    View view1;
    @BindView(R.id.txtUser)
    EditText txtUser;
    @BindView(R.id.del_txtUser)
    ImageView delTxtUser;
    @BindView(R.id.relativeLayout1)
    RelativeLayout relativeLayout1;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.view2)
    View view2;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.del_password)
    ImageView delPassword;
    @BindView(R.id.relativeLayout2)
    RelativeLayout relativeLayout2;
    @BindView(R.id.cbPwd)
    CheckBox cbPwd;
    @BindView(R.id.cbZdLogin)
    CheckBox cbZdLogin;
    @BindView(R.id.relativeLayout3)
    RelativeLayout relativeLayout3;
    @BindView(R.id.loginButton)
    Button loginButton;
    @BindView(R.id.relativeLayoutaotu)
    RelativeLayout relativeLayoutaotu;
    @BindView(R.id.textView4)
    TextView textView4;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private LoginBean loginBean;
    LoginPresenter presenter;
    ProgressDialog progressDialog;

    @Override
    public BasePresenter getPresenter() {
        return presenter;
    }

    @Override
    public void initPresenter() {
        presenter = new LoginPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("正在加载数据");
        pref= PreferenceManager.getDefaultSharedPreferences(this);
        EditTextClearTools.addclerListener(password, delPassword);
        EditTextClearTools.addclerListener(txtUser, delTxtUser);
        boolean isRemenber = pref.getBoolean("remember_password", false);
        boolean isAutoLogin = pref.getBoolean("auto_login", false);
        if (isRemenber) {
            //将账号和密码都设置到文本中
            String username = pref.getString("username", "");
            String pwd = pref.getString("password", "");
            Boolean isAL = pref.getBoolean("auto_login", false);
            txtUser.setText(username);
            password.setText(pwd);
            cbPwd.setChecked(true);
            cbZdLogin.setChecked(isAL);
            if (cbZdLogin.isChecked()) {
                Map<String, String> params = new HashMap<>();
                params.put("username", username);
                params.put("password", pwd);
              presenter.getData(params);
            }
        }
        else
        {
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String userName = txtUser.getText().toString();
                    String pwd = password.getText().toString();

                    if (userName.length() <= 0) {

                        showToast("用户名不能为空！");


                    } else if (pwd.length() <= 0) {

                        showToast("密码不能为空！");

                    } else {

                        Map<String, String> params = new HashMap<>();
                        params.put("username", userName);
                        params.put("password", pwd);
                        presenter.getData(params);

                    }
                }
            });

        }

    }

    @Override
    public void showErr(String msg) {
        this.showToast(msg);
    }

    @Override
    public void showData(String data) {
        this.showToast(data);
    }

    @Override
    public void setData(LoginBean data) {
        loginBean=data;

        editor = pref.edit();
        String userName = txtUser.getText().toString();
        String pwd = password.getText().toString();

        if (cbPwd.isChecked()) {

            editor.putBoolean("remember_password", true);
            editor.putBoolean("auto_login", cbZdLogin.isChecked());
            editor.putString("username", userName);
            editor.putString("password",  pwd);


        } else if (cbZdLogin.isChecked()) {
            editor.putBoolean("remember_password", true);
            editor.putBoolean("auto_login", true);
            editor.putString("username", userName);
            editor.putString("password", pwd);
        } else {
            editor.clear();
        }
        editor.apply();
        this.showToast("登录成功！");
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}
