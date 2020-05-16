package com.blog.dao;

import com.blog.pojo.Description;
import com.blog.pojo.Information;
import com.blog.pojo.Link;
import com.blog.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 行路
 * @Date: Created on 2020/5/14 21:56 星期四
 * @Description: com.blog.dao
 * @version: 1.0
 */
@Repository
public interface BlogDao {

    @Select("select * from description where uname=#{0}")
    Description selDescByName(String uname);

    @Select("select * from link where uname=#{0}")
    List<Link> selLinkByName(String uname);

    @Select("select * from information where uname=#{0}")
    Information selInfByName(String uname);

    @Select("select * from user where uanme=#{0}")
    User selUserByName(String uname);

}
