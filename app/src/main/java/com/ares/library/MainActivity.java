package com.ares.library;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.ares.library.mvp05.LoginPresenter05;
import com.ares.library.mvp05.LoginView05;
import com.ares.library.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity implements LoginView05 {

    @BindView(R.id.tv)
    TextView tv;

    private LoginPresenter05 mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        tv.setText("ButterKnife bind successful!");
    }

    @Override
    protected void initData() {
        //第一种： MVP 最基础用法
        //mPresenter = new LoginPresenter01(this);
        //mPresenter.login();

        //第二种：优化
        //存在的问题：Activity或Fragment关闭时，正在请求的操作任然在线程中运行，成功后任会回调
        //目的：这个时候应该不执行回调方法
        //mPresenter = new LoginPresenter02();
        //mPresenter.attachView(this);
        //mPresenter.login();

        //第三种：继续优化
        //存在的问题：每一个Presenter都需要实现attachView和detachView方法，代码冗余
        //解决方案：抽象方法
        //mPresenter = new LoginPresenter03();
        //mPresenter.attachView(this);
        //mPresenter.login();

        //第四种：继续优化
        //存在的问题：BasePresenter持有的View是写死的
        //解决方案：具体实现->高度抽象接口：没有任何定义，用于高度抽象绑定
        //mPresenter = new LoginPresenter04();
        //mPresenter.attachView(this);
        //mPresenter.login();

        //第五种：继续优化
        //存在的问题：getView()方法强转，非常麻烦
        //解决方案：泛型设计实现
        mPresenter = new LoginPresenter05();
        mPresenter.attachView(this);
        mPresenter.login();


    }

    @Override
    public void loginResult(String result) {
        Log.e("*****",result);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //第二种：优化第一种
        if (mPresenter != null) mPresenter.detachView();
    }
}
