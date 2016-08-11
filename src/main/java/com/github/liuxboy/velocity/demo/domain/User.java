package com.github.liuxboy.velocity.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Package: com.github.liuxboy.velocity.demo.domain <br>
 * Author: liuchundong <br>
 * Date: 2016/8/9 <br>
 * Time: 17:39 <br>
 * Desc: 用户实体
 */
public class User implements Serializable {

    private static final long serialVersionUID = -3649989821098922076L;

    private int id;
    private String name;
    private int age;
    private double salary;
    private Date birthday;
    public User() {
    }

    public User(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        final StringBuilder stbd = new StringBuilder("User{");
        stbd.append("\"id\":").append(id);
        stbd.append(",\"name\":\"").append(name).append('\"');
        stbd.append(",\"age\":").append(age);
        stbd.append(",\"salary\":").append(salary);
        stbd.append('}');
        stbd.append(super.toString());
        return stbd.toString();
    }
}
