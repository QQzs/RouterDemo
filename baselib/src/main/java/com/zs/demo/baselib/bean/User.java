package com.zs.demo.baselib.bean;

import java.io.Serializable;

/**
 * Created by zs
 * Date：2018年 12月 28日
 * Time：13:49
 * —————————————————————————————————————
 * About:
 * —————————————————————————————————————
 */
public class User implements Serializable{

    private String name;
    private int age;
    private String phone;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
