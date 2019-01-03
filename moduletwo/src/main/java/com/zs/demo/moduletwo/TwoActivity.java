package com.zs.demo.moduletwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zs.demo.baselib.RouterPath;

/**
 * Created by zs
 * Date：2019年 01月 02日
 * Time：10:37
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */
@Route(path = RouterPath.ROUTER_TWO)
public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void clickListener(View view){

        ARouter.getInstance().build(RouterPath.ROUTER_MAIN)
                .withFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP)
                .navigation();

    }

}
