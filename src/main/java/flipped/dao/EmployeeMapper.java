package flipped.dao;

import flipped.pojo.Account;
import flipped.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname EmployeeMapper
 * @Description TODO
 * @Date 2021/7/3 11:12
 * @Created by zh
 */

public interface EmployeeMapper {

     List<Employee> getEmployee();
}
