package com.nhr.springboot4.dao;

import com.nhr.springboot4.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    public Account getAccount(Long id);

}
