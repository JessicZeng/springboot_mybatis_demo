package com.jessic.springboot.mybatisdemo.domain;

import lombok.Data;

/**
 * @Auther: zengrenfeng
 * @Date: 2019/8/30 16:45
 * @Description:
 */
@Data
public class Student {

    /**
     * 学号
     */
    private long FuiId;


    /**
     * 姓名
     */
    private String FstrName;


    /**
     * 性别
     */
    private int FuiSex;


    /**
     * 年龄
     */
    private int FuiAge;


}
