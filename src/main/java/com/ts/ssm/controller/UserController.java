package com.ts.ssm.controller;

import com.ts.ssm.bean.User;
import com.ts.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(Integer id) {
        User user=userService.getUserById(id);
        System.out.println(user.getUserName());
        return user;
    }
    @RequestMapping(value = "/tx")
    public void transactionTest(){


        userService.addUser(new User("tx1","2",1,null));

    }
    @RequestMapping(value = "/tx2")
    public void transactionTest2(){
        userService.addUser2();
    }
}
