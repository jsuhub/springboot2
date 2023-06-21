package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class yuliangController {
    @RequestMapping("/name")
    public String returnName(){
        return "于亮";
    }
    @RequestMapping("/idf")
    public String idetifyName(){
        return "identifing successful!";
    }
}
