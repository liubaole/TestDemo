package com.oop;

public class thisTest {

    //成员变量和局部变量重名的时候Java会使用就近原则

    //this可有解决局部变量和全局变量

    // 调用自己本类的成员方法,this可以忽略


    String name;
    int age;
    public void thisTest1(String name) {
        System.out.println(name);
        System.out.println(this.name);
        this.thisTest2();

    }

    public  void thisTest2() {
        System.out.println(123123);
    }


}


