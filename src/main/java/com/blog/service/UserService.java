package com.blog.service;

import com.blog.pojo.Information;
import com.blog.pojo.User;

/**
 * @Auther: 行路
 * @Date: Created on 2020/5/9 13:11 星期六
 * @Description: com.blog.service
 * @version: 1.0
 */
public interface UserService {

    /**
     * 根据用户名和密码登录到后台管理页面
     * @param account
     * @param password
     * @return
     */
    User Login(String account,String password);



}
