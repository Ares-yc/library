package com.ares.library.ui.base.mvp.view;

import com.ares.library.ui.base.BaseFragment;
import com.ares.library.ui.base.mvp.presenter.MvpBasePresenter;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：The base class of mvp fragment
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/10/31.
 * UpdateDate   ：2018/10/31.
 * =========================================
 */
public abstract class MvpBaseFragment<V extends MvpView, P extends MvpBasePresenter<V>> extends BaseFragment{

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
    public void onDestroyView() {
        super.onDestroyView();
        this.mPresenter.detachView();
    }
}
