package com.zs.demo.routerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.zs.demo.baselib.RouterPath;

@Route(path = RouterPath.ROUTER_MAIN)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickListener(View view){

        int i = view.getId();
        if (i == R.id.tv_one) {
            ARouter.getInstance().build(RouterPath.ROUTER_ONE)
                    .navigation();

        } else if (i == R.id.tv_two) {
            ARouter.getInstance().build(RouterPath.ROUTER_TWO)
                    .navigation();

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
