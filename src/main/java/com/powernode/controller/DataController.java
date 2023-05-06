package com.powernode.controller;


import com.powernode.entity.Standard;
import com.powernode.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ajax")
public class DataController {

    @Autowired(required = false)
    private StandardService standardService;

    /**
     *        @Responsebody的注解中，方法不能有参数
     * @return
     */
    @RequestMapping( "/getAll")
    public Map<String,Object> ajax1(){
        Map<String,Object> model = new HashMap<>();
        System.out.println("获取数据");
        List<Standard> standards = standardService.getAll();
        model.put("standards",standards);
        return model;
    }

    @RequestMapping("/getOne")
    public Standard ajax2(HttpServletRequest request){
        Integer id = (Integer) request.getSession().getAttribute("id");
        System.out.println(id+"id");
        System.out.println("getOne");
        Standard standard = standardService.getOneById(id);
        System.out.println("standard = " + standard);
        return standard;
    }
}
