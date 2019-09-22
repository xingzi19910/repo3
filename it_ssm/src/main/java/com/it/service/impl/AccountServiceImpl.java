package com.it.service.impl;

import com.it.domain.Account;
import com.it.mapper.AccountMapper;
import com.it.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    public void save(Account account) {


        System.out.println("accountService..........");

        accountMapper.save(account);
    }
}
