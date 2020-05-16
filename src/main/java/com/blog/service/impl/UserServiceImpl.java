package com.blog.service.impl;

import com.blog.dao.UserDao;
import com.blog.pojo.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @Auther: 行路
 * @Date: Created on 2020/5/9 13:12 星期六
 * @Description: com.blog.service.impl
 * @version: 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public User Login(String account,String password) {
        System.out.println("登录");
        return userDao.selUserToLogin(account,password);
    }



}
