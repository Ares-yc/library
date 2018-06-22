package com.ares.library.mvp06;

import com.ares.library.mvp06.base.BasePresenter06;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public class LoginPresenter06 extends BasePresenter06<LoginView06>{

    private LoginModel06 mModel;

    public LoginPresenter06() {
        this.mModel = new LoginModel06();
    }

    public void login(){
        if (getView() != null){
            getView().loginResult(mModel.login());
        }
    }

}
