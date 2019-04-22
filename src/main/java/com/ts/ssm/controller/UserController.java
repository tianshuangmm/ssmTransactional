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
}
