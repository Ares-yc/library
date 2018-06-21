package com.ares.library.mvp05;

import com.ares.library.mvp05.base.BasePresenter05;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public class LoginPresenter05 extends BasePresenter05<LoginView05>{

    private LoginModel05 mModel;

    public LoginPresenter05() {
        this.mModel = new LoginModel05();
    }

    public void login(){
        if (getView() != null){
            getView().loginResult(mModel.login());
        }
    }

}
