package com.blog.dao;

import com.blog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 行路
 * @Date: Created on 2020/5/9 13:04 星期六
 * @Description: com.blog.mapper
 * @version: 1.0
 */

@Repository
public interface UserDao {
    //查询

    @Select("select * from user where account=#{account} and password=#{password} ")
    User selUserToLogin(@Param("account")String account,@Param("password")String password);

}
