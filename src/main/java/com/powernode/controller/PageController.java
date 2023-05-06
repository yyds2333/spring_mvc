package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/list")
public class PageController {

    @RequestMapping("/update")
    public String update(Integer id, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("id",id);
        return "edit";
    }

    @RequestMapping("/edit")
    public String edit(HttpServletRequest request){
        HttpSession session = request.getSession();
        if (session.getAttribute("id")!=null){
            session.removeAttribute("id");
        }
        return "edit";
    }

}
