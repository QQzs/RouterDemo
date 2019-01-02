package com.zs.demo.routerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.zs.demo.baselib.RouterPath;
import com.zs.demo.baselib.bean.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickListener(View view){
        switch (view.getId()){
            case R.id.tv_login:
                ArrayList<String> array = new ArrayList<>();
                array.add("123");
                List<User> users = new ArrayList<>();
                users.add(new User("aaa"));
                users.add(new User("bbb"));

                ARouter.getInstance().build(RouterPath.ROUTER_LOGIN)
                        .withString("phone" , "1234567")
                        .withInt("age" , 12)
                        .withSerializable("user" , new User("zzz"))
                        .withSerializable("users" , (Serializable) users)
                        .withStringArrayList("array" , array)
                        .navigation(this , 1000);

                break;
            case R.id.tv_other:
                ARouter.getInstance().build(RouterPath.ROUTER_OTHER).navigation();
                break;
            case R.id.tv_one:
                ARouter.getInstance().build(RouterPath.ROUTER_ONE)
                        .navigation();
                break;
            case R.id.tv_two:
                ARouter.getInstance().build(RouterPath.ROUTER_TWO)
                        .navigation();
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000 && resultCode == RESULT_OK){
            Toast.makeText(this,"1000",Toast.LENGTH_SHORT).show();
        }
    }
}
