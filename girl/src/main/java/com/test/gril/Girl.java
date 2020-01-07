package com.test.gril;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2020/1/7 13:49
 * @description: TODO
 */
public class Girl {

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

    public String introduce(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height='" + height + '\'' +
                '}';
    }
}
