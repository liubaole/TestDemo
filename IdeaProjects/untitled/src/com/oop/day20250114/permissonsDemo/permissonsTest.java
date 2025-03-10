package com.oop.day20250114.permissonsDemo;

public class permissonsTest {
    public static void main(String[] args) {
        Student student = new Student();
        //调用面向对象的方法是类名+对象名（自己编写） = new类名

        student.age = 23;
        student.show();

        /*
        * 权限修饰符
        * private,属性私有化
        * 比如加了private 属性就不能访问了，只能在同一个类进行访问。
        * */
//        student.name();//鼠标悬浮，查看原因。
//        student.show2();


        //defauld,只能在同一个包内进行访问,默认权限，可以不写
        student.show3();

        //protectad,不同包中只能访问子类。

    }
}
