package com.nhr.springboot4.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nhr.springboot4.bean.User;
import com.nhr.springboot4.dao.UserMapper;
import com.nhr.springboot4.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
