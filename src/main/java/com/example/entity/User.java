package com.example.entity;

import org.springframework.context.annotation.Bean;

/**
 * @author 赵奇伟
 * @description 用户表
 * @date 2020/8/20
 */
public class User {
    private int id;

    private String name;

    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
