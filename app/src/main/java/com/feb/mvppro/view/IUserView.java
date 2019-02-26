package com.feb.mvppro.view;

import com.feb.mvppro.model.User;

import java.util.List;

/**
 * Created by lilichun on 2019/2/26.
 */
public interface IUserView extends ICommonView{

    void showUsers(List<User> users);
}
