package com.chatRobot.service;
import com.chatRobot.model.User;
/**
 * Created by Administrator on 2018/10/10 0010.
 */
public interface IUserService {

    User selectUser(Integer userId);
}
