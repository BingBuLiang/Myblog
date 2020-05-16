package com.blog.controller;

import com.blog.pojo.User;
import com.blog.service.UserService;
import com.blog.service.impl.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: 行路
 * @Date: Created on 2020/5/9 13:15 星期六
 * @Description: com.blog.controller
 * @version: 1.0
 */
@Controller
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    

    @RequestMapping("login")
    @ResponseBody
    public String Login(String account, String password, HttpServletRequest request){
        String jsonpcallback = request.getParameter("jsonCallback");
      //  System.out.println(jsonpcallback);
        User user = userServiceImpl.Login(account,password);
        ObjectMapper om = new ObjectMapper();
        String s = null;
      //  System.out.println(account+":"+password);
        try {
            s = om.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        if(user==null){
            System.out.println("密码错误");
            return jsonpcallback+"({\"code\":\"201\",\"message\":\"用户名或密码错误\"})";
        }else{
            System.out.println("登录成功");
            return jsonpcallback+"("+s+")";
        }
    }

}
