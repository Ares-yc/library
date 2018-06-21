package com.ares.library.mvp04.base;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public abstract class BasePresenter04 {

    private MvpView04 mView;

    public MvpView04 getView(){
        return mView;
    }

    //绑定
    public void attachView(MvpView04 view){
        this.mView = view;
    }

    //解绑
    public void detachView(){
        this.mView = null;
    }
}
