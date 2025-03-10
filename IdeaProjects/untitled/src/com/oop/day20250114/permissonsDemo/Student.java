package com.oop.day20250114.permissonsDemo;

public class Student {
    int age;
    private String name;

    public void show(){
        System.out.println("show.....");
        System.out.println(name);//private,权限修饰符，只能在同一个类里面进行访问。

    }
    private void show2(){
        System.out.println("show2...");
    }

    void show3(){
        System.out.println("show3...");
    }
}
