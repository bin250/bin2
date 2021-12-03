package com.offcn.controller;

import com.offcn.bean.TblUser;
import com.offcn.dao.TblUserMapper;
import com.offcn.service.UserSerivice;
import com.offcn.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserSerivice userSerivice;
    private TblUserMapper userMapper;
    /**
     * 展示登录页面
     *
     * @return
     */
    @RequestMapping("show-login")
    public String showLogin() {
        return "login";
    }

    /**
     * 展示注册页面
     *
     * @param model
     * @return
     */
    @RequestMapping("show-register")
    public String showRegist(Model model) {
        model.addAttribute("user", new TblUser());
        return "register";
    }


    /**
     * 注册功能
     * @return
     */
    @RequestMapping("save-register")
    public String register(TblUser user) {
        BaseResult result = userSerivice.regist(user);
        if (result.isSuccess()) {
            //注册成功跳转登录页面
            return "login";
        }else{
            //注册失败重新加载注册页面
            return "register";
        }
    }

    /**
     * 登录校验
     * @param user
     * @return
     */
    @RequestMapping("login")
    public String login(TblUser user){
        BaseResult result=userSerivice.loginCheck(user);
        if (result.isSuccess()){
            //登录成功跳转到主页面
            return "redirect:/main/show-main";
        }else{
            //登录失败
            return"forward:/login.jsp";
        }

    }

}
