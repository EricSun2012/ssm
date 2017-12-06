package com.ericwork.service;

import com.ericwork.dao.UserDao;
import com.ericwork.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService implements UserServiceInterface {

    @Autowired
    private UserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectObject(userId);
    }

}