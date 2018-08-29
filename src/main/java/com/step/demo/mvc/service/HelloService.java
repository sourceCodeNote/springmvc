package com.step.demo.mvc.service;

import com.step.demo.mvc.model.Hello;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {

    public List<Hello> list(){
        List<Hello> list = new ArrayList<>();
        list.add(Hello.newHello("jack"));
        list.add(Hello.newHello("jack2"));
        list.add(Hello.newHello("jack3"));
        list.add(Hello.newHello("jack4"));
        list.add(Hello.newHello("jack5"));
        return list;
    }

}
