package com.jessic.springboot.mybatisdemo.service;

import com.jessic.springboot.mybatisdemo.domain.Student;
import com.jessic.springboot.mybatisdemo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: zengrenfeng
 * @Date: 2019/8/30 17:10
 * @Description:
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public int insertData(){
        Student student = new Student();
        student.setFuiId(100);
        student.setFstrName("jessic");
        student.setFuiAge(18);
        student.setFuiSex(1);

        int row = studentMapper.save(student);
        return row;
    }

    public Student selectById(long id){
        Student student = studentMapper.selectById(id);
        return student;
    }

    public int updateAge(long id,int age){
        int row = studentMapper.updateAge(18,1);
        return row;
    }


    public int deleteById(long id){
        int row = studentMapper.deleteById(id);
        return row;
    }
}
