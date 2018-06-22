package com.ares.library.mvp07.base;

import com.ares.library.ui.base.BaseActivity;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/22.
 * UpdateDate   ：2018/6/22.
 * =========================================
 */
public abstract class MvpActivity07<V extends MvpView07,P extends BasePresenter07> extends BaseActivity {

    private V mView;
    private P mPresenter;

    @Override
    protected void initMvp() {
        if (this.mView == null){
            this.mView = createView();
        }
        if (this.mPresenter == null){
            this.mPresenter = createPresenter();
        }
        if (this.mView != null && this.mPresenter != null){
            this.mPresenter.attachView(this.mView);
        }
    }

    protected abstract V createView();

    protected abstract P createPresenter();

    public P getPresenter(){
        return this.mPresenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.mPresenter.detachView();
    }
}
