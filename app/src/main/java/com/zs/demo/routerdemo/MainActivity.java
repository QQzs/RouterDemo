package com.zs.demo.routerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zs.demo.baselib.RouterPath;

@Route(path = RouterPath.ROUTER_MAIN)
public class MainActivity extends AppCompatActivity {

    Fragment fragmentOne;
    Fragment fragmentTwo;
    Fragment fragmentCurrent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOne = (Fragment) ARouter.getInstance().build(RouterPath.ROUTER_ONE_FRAGMENT).navigation();
        fragmentTwo = (Fragment) ARouter.getInstance().build(RouterPath.ROUTER_TWO_FRAGMENT).navigation();
        switchContent(fragmentOne);
    }

    public void clickListener(View view){

        int i = view.getId();
        if (i == R.id.tv_one) {
//            ARouter.getInstance().build(RouterPath.ROUTER_ONE)
//                    .navigation();
            switchContent(fragmentOne);
        } else if (i == R.id.tv_two) {
//            ARouter.getInstance().build(RouterPath.ROUTER_TWO)
//                    .navigation();
            switchContent(fragmentTwo);
        }

    }

    private void switchContent(Fragment fragment){

        if (fragment != null && fragmentCurrent != fragment){
            if (fragmentCurrent != null){
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.hide(fragmentCurrent).commitAllowingStateLoss();
            }
            fragmentCurrent = fragment;
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (fragment.isAdded()){
                transaction.show(fragment).commitAllowingStateLoss();
            }else{
                transaction.add(R.id.fl_container , fragment).commitAllowingStateLoss();
            }
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
