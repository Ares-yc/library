package com.ares.library.mvp07;

import com.ares.library.mvp07.LoginModel07;
import com.ares.library.mvp07.LoginView07;
import com.ares.library.mvp07.base.BasePresenter07;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public class LoginPresenter07 extends BasePresenter07<LoginView07>{

    private LoginModel07 mModel;

    public LoginPresenter07() {
        this.mModel = new LoginModel07();
    }

    public void login(){
        if (getView() != null){
            getView().loginResult(mModel.login());
        }
    }

}
