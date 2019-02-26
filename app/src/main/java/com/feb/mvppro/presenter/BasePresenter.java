package com.feb.mvppro.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by lilichun on 2019/2/26.
 */
public class BasePresenter<T> {

    protected WeakReference<T> mViewReference;

    /**
     * 绑定
     */
    public void attachView(T view) {
        mViewReference = new WeakReference<>(view);
    }

    /**
     * 解绑
     */
    public void dettachView() {
        if (mViewReference != null) {
            mViewReference.clear();
        }
    }
}
