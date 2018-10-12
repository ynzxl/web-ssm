package com.chatRobot.dao;

import com.chatRobot.model.User;

/**
 * Created by Administrator on 2018/10/10 0010.
 */
public interface IUserDao {
    User selectUser(Integer id);
}
