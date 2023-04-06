package com.nhr.springboot4;

import com.nhr.springboot4.bean.User;
import com.nhr.springboot4.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@MapperScan("com.nhr.springboot4.dao")
@SpringBootApplication
public class SpringBoot4Application {

    @Autowired
    UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot4Application.class, args);

    }
}
