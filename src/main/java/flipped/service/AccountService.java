package flipped.service;

import flipped.dao.AccountMapper;
import flipped.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname AccountService
 * @Description TODO
 * @Date 2021/7/3 11:40
 * @Created by zh
 */


@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;


    public Account getAccount(String name){
        Account accountInfo = accountMapper.getAccountInfo(name);
        return accountInfo;
    }
}
