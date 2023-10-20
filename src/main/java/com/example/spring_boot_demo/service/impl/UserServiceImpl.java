package com.example.spring_boot_demo.service.impl;
import com.example.spring_boot_demo.mapper.UserMapper;
import com.example.spring_boot_demo.pojo.UserInfo;
import com.example.spring_boot_demo.service.UserService;
import com.example.spring_boot_demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    @Override
    public List<UserInfo> findList() {
        return userMapper.selectList();
    }
}

