package com.nhr.springboot4.controller;

import com.nhr.springboot4.bean.Account;
import com.nhr.springboot4.bean.City;
import com.nhr.springboot4.bean.User;
import com.nhr.springboot4.dao.UserMapper;
import com.nhr.springboot4.service.impl.AccountServiceImpl;
import com.nhr.springboot4.service.impl.CityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class indexController {

    @Resource
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountServiceImpl accountService;

    @Autowired
    CityServiceImpl cityService;

    @Autowired
    UserMapper userMapper;

    @ResponseBody
    @PostMapping("/city")
    public City saveCity(City city){
        cityService.saveCity(city);
        return city;
    }

    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id){
        return cityService.getById(id);
    }

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        Long along = jdbcTemplate.queryForObject("select count(*) from account_tbl",Long.class);
        return along.toString();
    }

    @ResponseBody
    @RequestMapping("/acct")
    public Account getById(@RequestParam("id")long id){
        return accountService.getAcctById(id);
    }

    @RequestMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "/login",params = {"username","password"})
    public String loginToMain(User user, HttpSession session){
        if(StringUtils.hasLength(user.getUserName()) && StringUtils.hasLength(user.getPassword())) {
            return "login";
        }
        session.setAttribute("user",user);
        return "redirect:/index";
    }

    @RequestMapping(value = "/index")
    public String main(){
        return "index";
    }

    @ResponseBody
    @GetMapping("/usertest")
    public User testUserMapper(){
        User user = userMapper.selectById(1L);
        log.info("用户信息:{}",user);
        return user;
    }

}
