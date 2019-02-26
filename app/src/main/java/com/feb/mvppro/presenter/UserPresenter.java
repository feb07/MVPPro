package com.feb.mvppro.presenter;

import com.feb.mvppro.model.IUserModel;
import com.feb.mvppro.model.User;
import com.feb.mvppro.model.UserModel;
import com.feb.mvppro.view.IUserView;

import java.util.List;

/**
 * Created by lilichun on 2019/2/26.
 */
public class UserPresenter<T extends IUserView> extends BasePresenter<T> {


    private IUserModel userModel;

    public UserPresenter() {
        userModel = new UserModel();
    }



    /**
     * 获取数据，执行UI逻辑
     */
    public void getData() {
        if (mViewReference.get() != null) {
            mViewReference.get().showLoading();
            if (userModel != null) {
                userModel.loadUser(new IUserModel.UserLoadListener() {
                    @Override
                    public void onLoadComplete(List<User> users) {
                        mViewReference.get().hideLoading();
                        mViewReference.get().showUsers(users);
                    }
                });
            }
        }
    }
}
