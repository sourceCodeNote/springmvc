package com.step.demo.mvc.web;

import com.alibaba.fastjson.JSON;
import com.step.demo.mvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    HelloService service;


    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
    return JSON.toJSONString(service.list());
    }


}
