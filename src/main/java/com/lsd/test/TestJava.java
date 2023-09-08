package com.lsd.test;

import com.lsd.domain.Student;
import org.junit.jupiter.api.Test;

/**
 * @Author Liu ShaoDong
 * @Date 2023/9/8 10:09
 */
public class TestJava {


    @Test
    public void test01(){
        int a = 1;
        int b = 2;
        System.out.println(a+b);
    }

    @Test
    public void test02(){
        Student student = new Student();
        String name = "zhangsan";
        int password = 123456;
        student.setName(name);
        student.setPassword(password);
        System.out.println(student);

    }
}
