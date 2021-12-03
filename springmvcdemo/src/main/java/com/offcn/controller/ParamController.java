package com.offcn.controller;

import com.offcn.bean.User;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Service;
import java.io.IOException;

@Controller
@RequestMapping("param")
public class ParamController {
    @RequestMapping("test1")
    public  String test1(String username,String password){
        System.out.println("用户名："+username);
        System.out.println("密  码："+password);
        System.out.println("登录校验");
        return "/success.jsp";
    }

    @RequestMapping("test2")
    public String test2(User user){
        System.out.println(user);
        System.out.println( "注册用户到数据库");
        return "/success.jsp";
    }

    /**
     * 请求转发(地址不会改变)
     * @param request
     * @param response
     * @param session
     */
    @RequestMapping("test3")
    public void test3(HttpServletRequest request, HttpServletResponse response, HttpSession session , Model model) throws ServletException, IOException {
        System.out.println("请求转发");
        //显示数据到成功页面
        session.setAttribute("aaa","hellohello");
    request.getRequestDispatcher("/success.jsp").forward(request,response);
    }

    /**
     * 重定向(地址会改变)
     * @param response
     */
    @RequestMapping("test4")
    public void test4(HttpServletResponse response) throws IOException {
        System.out.println("我在做重定向");
        response.sendRedirect("/hello/world");
    }

    /**
     * springMVC请求转发
     * @return
     */
    @RequestMapping("test5")
    public  String test5(Model model){
        System.out.println( "请求转发");
        model.addAttribute("bb","hellobb");
        return "forward:/success.jsp";
    }

    /**
     * 重定向
     * @return
     */
    @RequestMapping("test6")
    public  String test6(Model model,HttpSession session){
        System.out.println("重定向");
        session.setAttribute("bb","hellohello");
        return "redirect:/success.jsp";
    }


}
