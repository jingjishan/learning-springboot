package com.example.spring_boot_demo.service;

import com.example.spring_boot_demo.pojo.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> findList();
}