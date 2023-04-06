package com.nhr.controller;

import com.nhr.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person controller1(){
        return person;
    }

}
