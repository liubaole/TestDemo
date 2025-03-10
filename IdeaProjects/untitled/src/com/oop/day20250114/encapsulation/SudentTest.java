package com.oop.day20250114.encapsulation;

public class SudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(25);

        int stuGat = s1.getAge();
        System.out.println(stuGat);
    }

}
