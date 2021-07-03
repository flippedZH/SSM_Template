package flipped.dao;

import flipped.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Classname EmployeeMapper
 * @Description TODO
 * @Date 2021/7/3 11:12
 * @Created by zh
 */

@Mapper
public interface EmployeeMapper {

    Account selectTest();
}
