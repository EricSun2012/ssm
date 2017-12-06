package com.ericwork.dao;

import com.ericwork.model.User;


public interface UserDao {
    User selectUser(long id);
}
