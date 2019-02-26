package com.feb.mvppro.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.feb.mvppro.presenter.BasePresenter;

/**
 * Created by lilichun on 2019/2/26.
 */
public abstract class BaseView<V, T extends BasePresenter<V>> extends Activity {

    public T basePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        basePresenter = createPresenter();
        basePresenter.attachView((V) this);

    }

    protected abstract T createPresenter();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (basePresenter != null) {
            basePresenter.dettachView();
        }
    }
}
