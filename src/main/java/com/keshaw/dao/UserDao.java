package com.keshaw.dao;

import com.keshaw.model.Login;
import com.keshaw.model.User;

public interface UserDao {

    void register(User user);

    User validateUser(Login login);
}
