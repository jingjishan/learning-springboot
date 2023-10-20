package com.example.spring_boot_demo.mapper;

import com.example.spring_boot_demo.pojo.UserInfo;

import java.util.List;

public interface UserMapper {
    List<UserInfo> selectList();
}