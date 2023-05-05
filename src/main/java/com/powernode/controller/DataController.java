package com.powernode.controller;


import com.powernode.entity.Standard;
import com.powernode.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ajax")
public class DataController {

    @Autowired(required = false)
    private StandardService standardService;

    /**
     *        @Responsebody的注解中，方法不能有参数
     * @return
     */
    @RequestMapping( "/getAll")
    @ResponseBody
    public Map<String,Object> ajax1(){
        Map<String,Object> model = new HashMap<>();
        System.out.println("获取数据");
        List<Standard> standards = standardService.getAll();
        model.put("standards",standards);
        return model;
    }
}
