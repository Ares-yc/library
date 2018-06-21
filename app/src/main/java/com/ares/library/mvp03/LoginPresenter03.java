package com.ares.library.mvp03;

import com.ares.library.mvp03.base.BasePresenter03;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public class LoginPresenter03 extends BasePresenter03{

    private LoginModel03 mModel;

    public LoginPresenter03() {
        this.mModel = new LoginModel03();
    }

    public void login(){
        if (getView() != null){
            getView().loginResult(mModel.login());
        }
    }

}
