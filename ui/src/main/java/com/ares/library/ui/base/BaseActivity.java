package com.ares.library.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：The base class of activity
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/20.
 * UpdateDate   ：2018/6/20.
 * =========================================
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initWindow();
        super.onCreate(savedInstanceState);
        setContentView(initLayoutId());
        initMvp();
        initWidget();
        initData();
    }

    /**
     * Init MVP Architecture
     */
    protected void initMvp() {}

    /**
     * Set Window Params
     */
    protected void initWindow() {}

    /**
     * Set Layout Id
     * @return LayoutId
     */
    protected abstract int initLayoutId();

    /**
     * Init Widget
     */
    protected abstract void initWidget();

    /**
     * Init Data
     */
    protected abstract void initData();
}
