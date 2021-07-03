package flipped.controller;

import flipped.pojo.Account;
import flipped.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname MyController
 * @Description TODO
 * @Date 2021/7/2 23:38
 * @Created by zh
 */

@Controller
public class MyController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/")
    public String hello(Model model){
        Account account = accountService.getAccount("小庄");
        model.addAttribute("accountInfo",account);
        return "hello";
    }

    @RequestMapping("/1")
    public String success(Model model){
        System.out.println("yes!!!!!!!!!!");
        Account account = accountService.getAccount("小庄");
        model.addAttribute("accountInfo",account);
        return "index";
    }

}
