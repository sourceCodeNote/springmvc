package com.step.demo.mvc.model;

public class Hello {

    public String name;

    public Hello() {
    }

    public Hello(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Hello newHello(String name){
        return new Hello(name);
    }
}
