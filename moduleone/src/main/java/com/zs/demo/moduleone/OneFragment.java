package com.zs.demo.moduleone;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zs.demo.baselib.RouterPath;
import com.zs.demo.baselib.base.BaseFragment;

/**
 * Created by zs
 * Date：2019年 01月 04日
 * Time：11:30
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */
@Route(path = RouterPath.ROUTER_ONE_FRAGMENT)
public class OneFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_one;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {

    }

    public void clickListener(View view){

        int id = view.getId();
        if (id == R.id.tv_login){
            ARouter.getInstance().build(RouterPath.ROUTER_LOGIN)
                    .withString("phone" , "123456789")
                    .navigation();
        }

    }
}