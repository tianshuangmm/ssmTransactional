package com.ts.ssm.service.serviceImpl;

import com.ts.ssm.bean.User;
import com.ts.ssm.dao.UserMapper;
import com.ts.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id) {

        return userMapper.getUserById(id);
    }

    public void addUser(User user) {
         int i =1/0;
        Integer integer = userMapper.addUser(user);
        System.out.println(integer);
    }

    public void addUser2() {

        User user= userMapper.getUserById(16);
        System.out.println("[执行了tx1]"+user.getUserName());
        System.out.println("执行了tx2  tx2添加");
        userMapper.addUser(new User("tx2","2",1,null));
        int i=1/0;
        System.out.println("执行了tx2  tx1添加");
        userMapper.addUser(new User("tx1","2",1,null));


    }
}
