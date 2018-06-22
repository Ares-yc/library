package com.ares.library.mvp06.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.ares.library.mvp06.LoginPresenter06;
import com.ares.library.mvp06.LoginView06;
import com.ares.library.ui.base.BaseActivity;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/22.
 * UpdateDate   ：2018/6/22.
 * =========================================
 */
public abstract class MvpActivity06 extends BaseActivity implements LoginView06{

    private LoginPresenter06 mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initWidget() {
        this.mPresenter = new LoginPresenter06();
        this.mPresenter.attachView(this);
    }

    public LoginPresenter06 getPresenter(){
        return this.mPresenter;
    }

    @Override
    public void loginResult(String result) {
        Log.e("*****",result);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.mPresenter.detachView();
    }
}
