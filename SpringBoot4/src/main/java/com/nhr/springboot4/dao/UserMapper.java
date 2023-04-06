package com.nhr.springboot4.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nhr.springboot4.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
