package com.lsd.domain;

/**
 * @Author Liu ShaoDong
 * @Date 2023/9/8 10:19
 */
public class Student {

    private  String name;
    private  int   password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}
