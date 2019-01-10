package com.example.xpeng.hellochartsdemo.Activity;

import android.view.View;

public interface IChartView {

    /**
     * 得到布局文件
     *
     * @return  布局文件id
     */
    int getLayoutId();

    /**
     * 初始化View
     */
    void initView();

    /**
     * 初始化界面数据
     */
    void initData();

    /**
     * 绑定监听器和适配器
     */
    void initListener();

    /**
     * 点击事件
     * @param v 点击的View
     */
    void processClick(View v);
}
