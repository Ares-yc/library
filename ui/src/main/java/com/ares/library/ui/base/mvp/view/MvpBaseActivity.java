package com.ares.library.ui.base.mvp.view;

import android.util.Log;

import com.ares.library.ui.base.BaseActivity;
import com.ares.library.ui.base.mvp.presenter.MvpBasePresenter;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：MVP模式Activity基类
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/10/30.
 * UpdateDate   ：2018/10/30.
 * =========================================
 */
public abstract class MvpBaseActivity<V extends MvpView, P extends MvpBasePresenter<V>> extends BaseActivity {

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
        Log.e("*****","abcd");
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
