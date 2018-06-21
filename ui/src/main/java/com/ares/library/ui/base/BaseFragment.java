package com.ares.library.ui.base;

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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
