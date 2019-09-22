package com.it.mapper;

import com.it.domain.Account;

public interface AccountMapper {

    public void save(Account account);

    public Account findAll();

    public void  update(Account account);



}
