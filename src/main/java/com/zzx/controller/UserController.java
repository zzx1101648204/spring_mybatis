package com.zzx.controller;

import com.zzx.dao.UserDao;
import com.zzx.entity.All;
import com.zzx.entity.User;
import com.zzx.service.UserService;
import com.zzx.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by:  John Zhu
 * Date: 2018/9/11 15:51
 **/
@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    UserDao userDao;

    @GetMapping("/get")
    public ModelAndView gets(HttpServletResponse httpServletResponse) throws IOException {
        ModelAndView mv = new ModelAndView();
        User user = userService.selectByPrimaryKey(1);
        //    mv.addObject("hello", "欢迎学习springmvc！");
        //返回物理视图
        //mv.setViewName("/WEB-INF/jsps/index.jsp");
        mv.setViewName("first");
        //返回逻辑视图
        return mv;
    }

    @RequestMapping("/gets")
    @ResponseBody
    public Object selectPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        int id = (int) Long.parseLong(request.getParameter("id"));
        User user = userService.selectByPrimaryKey(id);
//        response.getWriter().write(String.valueOf(user));
//        response.getWriter().close();
        return user;
    }

    @ResponseBody
    @GetMapping("/all")
    public Object all(String cupSize){
        System.out.println("开启二Mybatis级缓存");
        Object all=userDao.gets(cupSize);
        return all;
    }
}
