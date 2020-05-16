package com.blog.service.impl;

import com.blog.dao.BlogDao;
import com.blog.pojo.Blog;
import com.blog.pojo.Description;
import com.blog.pojo.Information;
import com.blog.pojo.Link;
import com.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 行路
 * @Date: Created on 2020/5/14 22:02 星期四
 * @Description: com.blog.service.impl
 * @version: 1.0
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public Description selDescByName(String uname) {
        return blogDao.selDescByName(uname);
    }

    @Override
    public Information selInfByName(String uname) {
        return blogDao.selInfByName(uname);
    }

    @Override
    public List<Link> selLinkByName(String uname) {
        return blogDao.selLinkByName(uname);
    }
}
