package com.jesper.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitController {
    @RequestMapping(value = "/")
    public String welcomeWeb(){
        return "login";
    }
}
