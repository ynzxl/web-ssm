package com.chatRobot.service.impl;

import com.chatRobot.dao.IUserDao;
import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao userDao;

    public User selectUser(Integer userId){
        return this.userDao.selectUser(1);
    }

}
