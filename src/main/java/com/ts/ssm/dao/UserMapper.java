package com.ts.ssm.dao;

import com.ts.ssm.bean.User;

public interface UserMapper {
    User getUserById(Integer id);

    void addUser(User user);
}
