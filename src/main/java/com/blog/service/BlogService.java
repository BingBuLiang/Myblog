package com.blog.service;

import com.blog.pojo.Description;
import com.blog.pojo.Information;
import com.blog.pojo.Link;

import java.util.List;

/**
 * @Auther: 行路
 * @Date: Created on 2020/5/14 21:59 星期四
 * @Description: com.blog.service
 * @version: 1.0
 */
public interface BlogService  {

    /**
     * 根据用户名查询关于个人的描述
     * @param uname 用户名
     * @return 返回个人描述
     */
    Description selDescByName(String uname);

    /**
     * 根据用户名查询个人的信息
     * @param uname 用户名
     * @return 返回个人的信息,头像,email，github网址等
     */
    Information selInfByName(String uname);


    List<Link> selLinkByName(String uname);
}
