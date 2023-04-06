package com.nhr.springboot4.service.impl;

import com.nhr.springboot4.bean.Account;
import com.nhr.springboot4.dao.AccountMapper;
import com.nhr.springboot4.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account getAcctById(long id){
        return accountMapper.getAccount(id);
    }
}
