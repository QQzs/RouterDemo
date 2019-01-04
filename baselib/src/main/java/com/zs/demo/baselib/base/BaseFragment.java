package com.zs.demo.baselib.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zs
 * Date：2017年 09月 25日
 * Time：11:24
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */
public abstract class BaseFragment extends Fragment {

    /**
     * 上下文对象
     */
    protected Context mContext;
    /**
     * 所属activity
     */
    protected Activity mActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //加载布局
        View view = inflater.inflate(getLayoutId(),container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mContext = getContext();
        mActivity = (Activity) getContext();
        initView(view,savedInstanceState);
        initData();
    }

    /**
     * 获取当前layouty的布局ID,用于设置当前布局
     * 交由子类实现
     * @return
     */
    protected abstract int getLayoutId();

    /**
     * 初始化view
     * 子类实现 控件绑定、视图初始化等内容
     * @param savedInstanceState
     */
    protected abstract void initView(View view, Bundle savedInstanceState);
    /**
     * 初始化数据
     * 子类可以复写此方法初始化子类数据
     */
    protected abstract void initData();

//    //获得fragment中的控件
//    public <T extends View> T findViewById(int id) {
//        if (contentView != null)
//            return (T) getContentView().findViewById(id);
//        return null;
//    }

}
