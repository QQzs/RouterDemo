package com.zs.demo.routerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zs.demo.baselib.RouterPath;
import com.zs.demo.baselib.bean.User;

import java.util.List;

/**
 * Created by zs
 * Date：2018年 12月 28日
 * Time：14:21
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */
@Route(path = RouterPath.ROUTER_OTHER)
public class OtherActivity extends AppCompatActivity {

    @Autowired(name = "age")
    public int age;
    @Autowired(name = "user")
    public User mUser;

    public List<User> mUsers;
    public List<String> mArray;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        ARouter.getInstance().inject(this);

        Log.d("My_Log","age = " + age);
        if (mUser != null){
            Log.d("My_Log","name = " + mUser.getName());
        }

        mUsers = (List<User>) getIntent().getSerializableExtra("users");
        mArray = getIntent().getStringArrayListExtra("array");
        if (mUsers != null){
            Log.d("My_Log","users size = " + mUsers.size());
        }
        if (mArray != null){
            Log.d("My_Log","array size = " + mArray.size());
        }

    }

    public void clickListener(View view){

        ARouter.getInstance().build(RouterPath.ROUTER_MAIN)
                .withFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP)
                .navigation();

    }

}
