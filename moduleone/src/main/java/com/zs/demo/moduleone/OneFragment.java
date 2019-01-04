package com.zs.demo.moduleone;

import android.os.Bundle;
import android.view.View;

import com.zs.demo.baselib.base.BaseFragment;

/**
 * Created by zs
 * Date：2019年 01月 04日
 * Time：11:30
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */
//@Route(path = RouterPath.ROUTER_ONE_FRAGMENT)
public class OneFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_one;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

//        view.findViewById(R.id.tv_login).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ARouter.getInstance().build(RouterPath.ROUTER_LOGIN)
//                        .withString("phone" , "123456789")
//                        .navigation();
//            }
//        });
//
//        view.findViewById(R.id.tv_other).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ArrayList<String> array = new ArrayList<>();
//                array.add("123");
//                List<User> users = new ArrayList<>();
//                users.add(new User("aaa"));
//                users.add(new User("bbb"));
//
//                ARouter.getInstance().build(RouterPath.ROUTER_OTHER)
//                        .withInt("age", 12)
//                        .withSerializable("user", new User("zzz"))
//                        .withSerializable("users", (Serializable) users)
//                        .withStringArrayList("array", array)
//                        .navigation();
//            }
//        });

    }

    @Override
    protected void initData() {

    }

}
