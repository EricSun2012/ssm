package com.ericwork.service;

import com.ericwork.dao.UserDao;
import com.ericwork.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectObject(userId);
    }

    public void insertUser(User user) {
        user.setRegTime(new Date());
        userDao.saveObject(user);
    }


}