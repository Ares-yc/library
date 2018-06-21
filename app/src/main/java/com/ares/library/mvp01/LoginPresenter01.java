package com.ares.library.mvp01;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public class LoginPresenter01 {

    private LoginModel01 mModel;
    private LoginView01 mView;

    public LoginPresenter01(LoginView01 mView) {
        this.mModel = new LoginModel01();
        this.mView = mView;
    }

    public void login(){
        if (mView != null){
            mView.loginResult(mModel.login());
        }
    }

}
