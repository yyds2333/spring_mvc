package com.powernode.controller;


import com.powernode.entity.Standard;
import com.powernode.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ajax")
public class DataController {

    @Autowired(required = false)
    private StandardService standardService;

    @RequestMapping("/getAll")
    @ResponseBody
    public String ajax1(Model model){
        List<Standard> standards = standardService.getAll();
        model.addAttribute("standards",standards);
        return "standards";
    }

}
