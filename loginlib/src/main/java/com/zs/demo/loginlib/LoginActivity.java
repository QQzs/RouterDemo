package com.zs.demo.loginlib;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.zs.demo.baselib.RouterPath;

import io.reactivex.functions.Consumer;

/**
 * Created by zs
 * Date：2018年 12月 27日
 * Time：16:45
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */
@Route(path = RouterPath.ROUTER_LOGIN)
public class LoginActivity extends AppCompatActivity {

    @Autowired(name = "phone")
    public String phone;


    public EditText et_login_phone;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ARouter.getInstance().inject(this);
        et_login_phone = findViewById(R.id.et_login_phone);
        et_login_phone.setText(phone);

    }

    public void login(View view){
        setResult(RESULT_OK , new Intent());
        finish();
    }

    public void permission(View view){
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.request(Manifest.permission.CAMERA)
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean aBoolean) throws Exception {
                        if (aBoolean){
                            Toast.makeText(LoginActivity.this , "yes" , Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
