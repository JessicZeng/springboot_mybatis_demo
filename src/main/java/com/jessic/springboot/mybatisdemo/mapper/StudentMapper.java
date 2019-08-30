package com.jessic.springboot.mybatisdemo.mapper;

import com.jessic.springboot.mybatisdemo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: zengrenfeng
 * @Date: 2019/8/30 16:54
 * @Description:
 */

@Mapper
public interface StudentMapper {

    //插入数据
    int save(@Param("domain") Student domain);

    //查询数据
    Student selectById(@Param("id") long id);

    //更新数据
    int updateAge(@Param("age") int age,@Param("id") long id);

    //删除数据
    int deleteById(@Param("id") long id);

}
