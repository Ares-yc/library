package com.ares.library.mvp08.base;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/21.
 * UpdateDate   ：2018/6/21.
 * =========================================
 */
public abstract class BasePresenter08<V extends MvpView08> {

    private V mView;

    public V getView(){
        return mView;
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
