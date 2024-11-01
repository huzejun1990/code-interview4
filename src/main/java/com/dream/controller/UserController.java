package com.dream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: huzejun
 * @Date: 2024/11/1 21:04
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/info")
    public ModelAndView info() {
        int i = 1/0;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/info");
        mv.addObject("username", "张三");
        return mv;
    }



}
