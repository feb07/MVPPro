package com.feb.mvppro.model;

import java.util.List;

/**
 * Created by lilichun on 2019/2/26.
 */
public interface IUserModel {
    void loadUser(UserLoadListener loadListener);

    interface UserLoadListener {
        void onLoadComplete(List<User> users);
    }

}
