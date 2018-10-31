package com.ares.library.ui.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * =========================================
 * Author       ：https://github.com/Ares-yc
 * Description  ：The base class of fragment
 * VersionCode  ：1.0.0
 * CreateDate   ：2018/6/20.
 * UpdateDate   ：2018/6/20.
 * =========================================
 */
public abstract class BaseFragment extends Fragment{

    public Activity mParentActivity;
    public View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(initLayoutId(),null);
        mParentActivity = getActivity();
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initMvp();
        initWidget(rootView);
        initData();
    }

    /**
     * Set Layout Id
     */
    protected abstract int initLayoutId();

    /**
     * Init MVP Architecture
     */
    protected abstract void initMvp();

    /**
     * Init Widget
     */
    protected abstract void initWidget(View rootView);

    /**
     * Init Data
     */
    protected abstract void initData();
}
