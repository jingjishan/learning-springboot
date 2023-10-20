package com.example.spring_boot_demo.controller;

import com.example.spring_boot_demo.pojo.UserInfo;
import com.example.spring_boot_demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping(value="/list")
    public R hello() {
        List<UserInfo> userInfoList = userService.findList();
        return R.okData(userInfoList);
    }
}
