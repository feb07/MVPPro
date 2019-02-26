package com.feb.mvppro.view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.feb.mvppro.R;
import com.feb.mvppro.model.User;
import com.feb.mvppro.presenter.UserPresenter;

import java.util.List;

public class MainActivity extends BaseView<IUserView, UserPresenter<IUserView>> implements IUserView {

    private RecyclerView recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_view = findViewById(R.id.recycler_view);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        recycler_view.setLayoutManager(lm);
        basePresenter.getData();
    }

    @Override
    protected UserPresenter<IUserView> createPresenter() {
        return new UserPresenter<>();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showUsers(List<User> users) {
        //显示数据
        RecyclerAdapter adapter = new RecyclerAdapter(this, users);
        recycler_view.setAdapter(adapter);
    }
}
