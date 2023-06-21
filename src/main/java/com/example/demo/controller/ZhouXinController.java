package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ZhouXinController {
    @RequestMapping("zx")
    @ResponseBody
    public String way(){
        return "successful";

    }
    @RequestMapping("zxz")
    @ResponseBody
    public String way2(){
        return "successfulz";

    }
}
