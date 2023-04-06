package com.nhr.springboot4.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

@Data
public class User extends Page {

    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;

//   一下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
