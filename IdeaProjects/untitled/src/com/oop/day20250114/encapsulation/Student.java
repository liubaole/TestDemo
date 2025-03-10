package com.oop.day20250114.encapsulation;

public class Student {
    private int age;

    public void setAge(int age) {
        if (age > 18 && age < 65) {
            this.age = age;
        }else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

}
