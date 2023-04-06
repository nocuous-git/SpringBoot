package com.nhr.springboot3.controller;

import com.nhr.springboot3.bean.Person;
import com.sun.corba.se.impl.orb.PropertyOnlyDataCollector;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController

public class ParameterTestController {

    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson() {
        Person person = new Person();

        person.setAge(12);
        person.setBirth(new Date());
        person.setUserName("张三");

        return person;
    }
}
