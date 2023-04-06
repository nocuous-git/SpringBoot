package com.nhr.springboot4.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nhr.springboot4.bean.User;
import com.nhr.springboot4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TableController {

    @Autowired
    UserService userService;

    @RequestMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }

    @RequestMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value="pn",defaultValue = "1") Integer pn, Model model){
        Page<User> page = new Page<>(pn, 2);
        Page<User> userPage = userService.page(page);
        model.addAttribute("page",userPage);
        /*List<User> list = userService.list();
        model.addAttribute("users",list);*/
        return "table/dynamic_table";
    }

    @RequestMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

    @RequestMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
