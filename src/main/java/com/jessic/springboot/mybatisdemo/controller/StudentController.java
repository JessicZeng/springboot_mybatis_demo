package com.jessic.springboot.mybatisdemo.controller;

import com.jessic.springboot.mybatisdemo.domain.Student;
import com.jessic.springboot.mybatisdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zengrenfeng
 * @Date: 2019/8/30 17:21
 * @Description:
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/insert")
    public String insert() {
        try{
            studentService.insertData();
            return "插入数据成功";
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "插入数据失败";
        }
    }

    @RequestMapping(value="/select")
    public String select(long id) {
        try{
            Student student = studentService.selectById(id);
            return "获取数据成功";
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "获取数据失败";
        }
    }

    @RequestMapping(value="/delete")
    public String delete(long id) {
        try{
            int row = studentService.deleteById(id);
            return "删除数据成功";
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "获取数据失败";
        }
    }

    @RequestMapping(value="/update")
    public String update(long id,int age) {
        try{
            int row = studentService.updateAge(id,age);
            return "更新数据成功";
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "更新数据失败";
        }
    }
}
