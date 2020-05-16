package com.blog.controller;

import com.blog.pojo.Description;
import com.blog.pojo.Information;
import com.blog.pojo.Link;
import com.blog.service.BlogService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Auther: 行路
 * @Date: Created on 2020/5/14 21:56 星期四
 * @Description: com.blog.controller
 * @version: 1.0
 */
@Controller
public class BlogController {

    @Autowired
    private BlogService blogServiceImpl;

    @RequestMapping(value ="/about",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String selDescByName(String uname, HttpServletRequest request){
        String jsonpcallback = request.getParameter("jsonCallback");
        Description description = blogServiceImpl.selDescByName(uname);
        ObjectMapper om = new ObjectMapper();
        String s = null;
        try {
            s = om.writeValueAsString(description);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        if(description==null){
            return jsonpcallback+"({\"code\":\"201\",\"message\":\"没有该人,请重新登录\"})";
        }else{
            return jsonpcallback+"("+s+")";
        }
    }

    @RequestMapping(value ="/inf",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String selInfByName(String uname, HttpServletRequest request){
        String jsonpcallback = request.getParameter("jsonCallback");
        Information information = blogServiceImpl.selInfByName(uname);
        ObjectMapper om = new ObjectMapper();
        String s = null;
        try {
            s = om.writeValueAsString(information);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        if(information==null){
            return jsonpcallback+"({\"code\":\"201\",\"message\":\"没有该人,请重新登录\"})";
        }else{
            return jsonpcallback+"("+s+")";
        }
    }

    @RequestMapping(value ="/link",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String selLinkByName(String uname, HttpServletRequest request){
        String jsonpcallback = request.getParameter("jsonCallback");
        List<Link> links = blogServiceImpl.selLinkByName(uname);
        ObjectMapper om = new ObjectMapper();
        String s = null;
        try {
            s = om.writeValueAsString(links);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        if(links==null){
            return jsonpcallback+"({\"code\":\"201\",\"message\":\"没有该人,请重新登录\"})";
        }else{
            return jsonpcallback+"("+s+")";
        }
    }
}
