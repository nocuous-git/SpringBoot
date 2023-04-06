package com.nhr.springboot4;

import com.nhr.springboot4.bean.User;
import com.nhr.springboot4.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@SpringBootApplication
class SpringBoot4ApplicationTests {

    @Resource
    JdbcTemplate jdbcTemplate;

    @Resource
    UserMapper usermapper;

    @Test
    void contextLoads() {
//        jdbcTemplate.queryForObject("select * from account_tbl", User.class);
        System.out.println(jdbcTemplate.queryForList("select * from account_tbl"));
    }

    @Test
    void testUserMapper(){
        User user = usermapper.selectById(1L);
        log.info("用户信息:{}",user);
    }

}
