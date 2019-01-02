package com.zs.demo.moudlemain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zs.demo.baselib.RouterPath;

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

    }
}
