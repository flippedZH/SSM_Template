package flipped.test;

import flipped.dao.EmployeeMapper;
import flipped.pojo.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname TestPaganation
 * @Description TODO
 * @Date 2021/7/3 22:30
 * @Created by zh
 */

@Component
public class TestPagination {

    @Autowired
    EmployeeMapper employeeMapper;

    public  List<Employee> getPageContent(){
        List<Employee> employee = employeeMapper.getEmployee();
       return employee;
    }

}
