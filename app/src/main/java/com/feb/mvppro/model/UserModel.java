package com.feb.mvppro.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lilichun on 2019/2/26.
 */
public class UserModel implements IUserModel {
    @Override
    public void loadUser(UserLoadListener loadListener) {
        //数据获取
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.name = "第" + i + "个";
            users.add(user);
        }
        loadListener.onLoadComplete(users);
    }
}
