package com.oop.day20250114.domain;

public class Student {
    //JavaBeam
    //成员变量私有化
    private int age;
    private String name;
    //空参，带参构造方法
    public Student() {}
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(int age, String name, int money) {
        this.age = age;
        this.name = name;
        this.money = money;
    }

    //私有化成员变量，提供gat set方法。
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    //有快捷键
    private int money;


    /**
     * 获取
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }


}
