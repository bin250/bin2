package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {
    /**
     * 处理请求
     * @return
     */
    @RequestMapping("world")

    public String test1() {
        System.out.println("处理请求");
        return"/success.jsp";
    }
}
