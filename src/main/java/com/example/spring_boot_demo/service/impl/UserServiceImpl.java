package com.example.spring_boot_demo.service.impl;

import com.example.spring_boot_demo.dao.UserDao;
import com.example.spring_boot_demo.entity.vo.User;
import com.example.spring_boot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: learning-springboot
 * @description:
 * @author: cxc
 * @create: 2023-10-23 16:47
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public User selectByPrimaryKey(Long id) {
        return userDao.selectByPrimaryKey(id);
    }
}
