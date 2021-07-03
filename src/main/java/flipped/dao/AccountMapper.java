package flipped.dao;

import flipped.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Classname AccountMapper
 * @Description TODO
 * @Date 2021/7/3 11:32
 * @Created by zh
 */

//使用注解形式写sql语句就加上@Mapper

public interface AccountMapper {

//    @Select("select * from `account` where `name`=#{name}")
    Account getAccountInfo(String name);
}
