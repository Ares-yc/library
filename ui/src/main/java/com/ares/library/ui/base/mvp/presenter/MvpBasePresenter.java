package com.ares.library.ui.base.mvp.presenter;

import com.ares.library.ui.base.mvp.view.MvpView;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：MVP模式Presenter基类
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/10/30.
 * UpdateDate   ：2018/10/30.
 * =========================================
 */
public abstract class MvpBasePresenter<V extends MvpView> {

    private V mView;

    public V getView(){
        return this.mView;
    }

    //绑定
    public void attachView(V view){
        this.mView = view;
    }

    //解绑
    public void detachView(){
        this.mView = null;
    }

}
