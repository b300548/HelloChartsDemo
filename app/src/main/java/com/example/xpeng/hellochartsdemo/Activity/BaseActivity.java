package com.example.xpeng.hellochartsdemo.Activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity implements IChartView, View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 得到布局文件
        setContentView(getLayoutId());

        // 初始化View
        initView();

        // 初始化界面数据
        initData();

        // 绑定监听器与适配器
        initListener();
    }


    /**
     * 对同一的按钮进行同一处理
     * @param v  点击的View
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            default:
                processClick(v);
                break;
        }
    }

    /**
     * 显示一个Toast
     * @param msg  Toast的内容
     */
    protected void baseToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }


    /**
     * 显示一个Toast
     *
     * @param msgId  Toast的内容
     */
    protected void baseToast(int msgId){
        Toast.makeText(this,msgId,Toast.LENGTH_SHORT).show();
    }
}
