package com.ares.library.mvp02;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public class LoginPresenter02 {

    private LoginModel02 mModel;
    private LoginView02 mView;

    public LoginPresenter02() {
        this.mModel = new LoginModel02();
    }

    //绑定
    public void attachView(LoginView02 view){
        this.mView = view;
    }

    //解绑
    public void detachView(){
        this.mView = null;
    }

    public void login(){
        if (mView != null){
            mView.loginResult(mModel.login());
        }
    }

}
