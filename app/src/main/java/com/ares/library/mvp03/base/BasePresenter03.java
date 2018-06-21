package com.ares.library.mvp03.base;

import com.ares.library.mvp03.LoginView03;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public abstract class BasePresenter03 {

    private LoginView03 mView;

    public LoginView03 getView(){
        return mView;
    }

    //绑定
    public void attachView(LoginView03 view){
        this.mView = view;
    }

    //解绑
    public void detachView(){
        this.mView = null;
    }
}
