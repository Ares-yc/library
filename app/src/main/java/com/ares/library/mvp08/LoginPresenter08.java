package com.ares.library.mvp08;

import com.ares.library.mvp08.base.BasePresenter08;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public class LoginPresenter08 extends BasePresenter08<LoginView08>{

    private LoginModel08 mModel;

    public LoginPresenter08() {
        this.mModel = new LoginModel08();
    }

    public void login(){
        if (getView() != null){
            getView().loginResult(mModel.login());
        }
    }

}
