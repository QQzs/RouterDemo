package com.zs.demo.baselib;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by zs
 * Date：2018年 12月 27日
 * Time：16:59
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */
public class BaseApplication extends Application{

    public static BaseApplication mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        init();
    }

    private void init() {
        //组件化ARouter初始化
        if (BaseConfig.isDebug) {
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
