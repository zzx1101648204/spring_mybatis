package com.zzx.controller;

import com.zzx.dao.UserDao;
import com.zzx.entity.All;
import com.zzx.entity.Boy;
import com.zzx.entity.User;
import com.zzx.service.BoyService;
import com.zzx.service.UserService;
import com.zzx.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.dozer.DozerBeanMapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by:  John Zhu
 * Date: 2018/9/11 15:51
 **/

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;
    @Autowired
    private BoyService boyService;

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

    private static int i=1;
    @ResponseBody
    @GetMapping(value = "/all",produces = "application/json;charset=UTF-8")
    public All all(String id){
        System.out.println("开启二Mybatis级缓存");
        List<All> alls=userDao.gets(id);
        System.out.println(alls);
        if(!CollectionUtils.isEmpty(alls)){
           All all=alls.get(0);
           //bean copy 任务
            DozerBeanMapper mapper = new DozerBeanMapper();
            All copy=mapper.map(all,All.class);
            copy.setAge(26);
            copy.setHigh(171);
            copy.setNumber("23");
            System.out.println(copy.toString());
            System.out.println(all.toString());
            return all;
        }
         return null;
    }

    @ResponseBody
    @GetMapping(value = "/del",produces = "application/json;charset=UTF-8")
    public int deleteOne(int high){
        return boyService.deleteByHigh(high);
    }
    @ResponseBody
    @GetMapping(value = "/age",produces = "application/json;charset=UTF-8")
    public List<Boy> selectByAge(int age){
        return boyService.selectByAge(age);
    }
}
