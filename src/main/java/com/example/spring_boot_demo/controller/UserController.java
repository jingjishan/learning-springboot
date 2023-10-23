package com.example.spring_boot_demo.controller;

import com.example.spring_boot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: learning-springboot
 * @description: 用户
 * @author: cxc
 * @create: 2023-10-23 16:48
 **/


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    String selectByPrimaryKey(){
        return  userService.selectByPrimaryKey(1L).toString();
    }
}
