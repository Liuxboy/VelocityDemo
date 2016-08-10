package com.github.liuxboy.velocity.demo.domain;

import java.io.Serializable;

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

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        final StringBuilder stbd = new StringBuilder("User{");
        stbd.append("\"id\":").append(id);
        stbd.append(",\"name\":\"").append(name).append('\"');
        stbd.append(",\"age\":").append(age);
        stbd.append('}');
        stbd.append(super.toString());
        return stbd.toString();
    }
}
