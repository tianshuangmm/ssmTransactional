package com.ts.ssm.service.serviceImpl;

import com.ts.ssm.bean.User;
import com.ts.ssm.dao.UserMapper;
import com.ts.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
/*
* 除此以外，@Transactional 注解也可以添加到类级别上。
* 当把@Transactional 注解放在类级别时，表示所有该类的公共方法都配置相同的事务属性信息。
* EmployeeService 的所有方法都支持事务并且是只读。
* 当类级别配置了@Transactional，方法级别也配置了@Transactional，
* 应用程序会以方法级别的事务属性信息来管理事务，
* 换言之，方法级别的事务属性信息会覆盖类级别的相关配置信息。

作者：慕桂英3389331
链接：http://www.imooc.com/article/257614
来源：慕课网*/
//@Transactional(propagation = Propagation.REQUIRED)
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
