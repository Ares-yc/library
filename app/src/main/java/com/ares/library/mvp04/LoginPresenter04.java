package com.ares.library.mvp04;

import com.ares.library.mvp04.base.BasePresenter04;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public class LoginPresenter04 extends BasePresenter04{

    private LoginModel04 mModel;

    public LoginPresenter04() {
        this.mModel = new LoginModel04();
    }

    public void login(){
        if (getView() != null && getView() instanceof LoginView04){
            ((LoginView04)getView()).loginResult(mModel.login());
        }
    }

}
