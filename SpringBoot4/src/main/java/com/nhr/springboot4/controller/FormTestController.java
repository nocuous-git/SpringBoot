package com.nhr.springboot4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormTestController {

    @GetMapping("/from_layouts")
    public String Form_layouts(){
        return "form/form_layouts";
    }

}
