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

    public void insertUser() {
        User user = new User();
        user.setEmail("12@11d.com");
        user.setUsername("22");
        user.setPassword("311");
        user.setRegIp("1");
        user.setRole("122");
        user.setStatus(5);
        user.setRegTime(new Date());
        userDao.insertObject(user);
    }
}