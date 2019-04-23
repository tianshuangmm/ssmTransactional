package com.ts.ssm.controller;

import com.ts.ssm.bean.User;
import com.ts.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get",method = RequestMethod.DELETE)
    @ResponseBody
    public User getUserById(/*Integer id*/) {
        return userService.getUserById(1);
    }
    @RequestMapping(value = "/tx")
    public void transactionTest(){
        userService.getUserById(1);
        userService.addUser(new User(2,"1","2",1,null));
    }
}
