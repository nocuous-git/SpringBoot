package com.nhr.springboot3.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Person {

    private Integer Age;
    private Date Birth;
    private String UserName;
    private Pet Pet;

}
