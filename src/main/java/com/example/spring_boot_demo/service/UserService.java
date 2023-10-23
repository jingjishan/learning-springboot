package com.example.spring_boot_demo.service;

import com.example.spring_boot_demo.dao.UserDao;
import com.example.spring_boot_demo.entity.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {

    User selectByPrimaryKey(Long id);


}
