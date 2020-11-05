package com.offcn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestOne {
    static final int One = 90;
    @GetMapping("/getOne")
    public void getOne(){
        System.out.println("1");
    }
}
