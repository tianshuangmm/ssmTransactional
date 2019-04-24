package com.ts.ssm.dao;

import com.ts.ssm.bean.User;

public interface UserMapper {
    User getUserById(Integer id);

    Integer addUser(User user);
}
