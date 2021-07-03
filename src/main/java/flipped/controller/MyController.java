package flipped.controller;

import com.github.pagehelper.PageHelper;
import flipped.pojo.Account;
import flipped.pojo.Employee;
import flipped.service.AccountService;
import flipped.test.TestPagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @Autowired
    private TestPagination testPagination;

    @RequestMapping("/")
    public String hello(Model model){
        Account account = accountService.getAccount("小庄");
        model.addAttribute("accountInfo",account);
        PageHelper.startPage(1,5);
        List<Employee> pageContent = testPagination.getPageContent();
        for(Employee employee1:pageContent){
            System.out.println(employee1);
        }
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
