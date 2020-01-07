package com.test.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/7 15:23
 * @description: TODO
 */
@ConfigurationProperties(prefix = "com.m")
public class GirlProperties {

    private String name;
    private int age;
    private String height;

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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "GirlProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                '}';
    }
}
