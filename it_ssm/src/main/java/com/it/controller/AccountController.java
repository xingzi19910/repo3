package com.it.controller;

import com.it.domain.Account;
import com.it.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/save")
    @ResponseBody
    public String save(Account account){
        System.out.println("AccountController save...");
        System.out.println("6666666");
        accountService.save(account);
        return null;
    }

}
/*µÚÒ»´Î*/
