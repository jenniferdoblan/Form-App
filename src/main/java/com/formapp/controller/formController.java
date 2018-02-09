package com.formapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // to let know this is controller
public class formController {
    @RequestMapping("/")
    public String listForm(){
            return "home";
        }
}
