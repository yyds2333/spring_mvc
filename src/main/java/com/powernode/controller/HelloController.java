package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 欢迎页面
 */
@Controller
public class HelloController{

    @RequestMapping("/welcome")
    public String index1(Model model){
        System.out.println("进入welcome");
        model.addAttribute("welcome","欢迎你");
        return "welcome";
    }

    @RequestMapping("/page")
    public String index2(Model model){
        System.out.println("进入page页面");
        return "index";
    }

    @RequestMapping("/modify")
    public String index3(Model model){
        System.out.println("进入修改页面");
        return "edit";
    }

}
