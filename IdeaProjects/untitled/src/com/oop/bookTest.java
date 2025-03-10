package com.oop;

public class bookTest {

    public static void main(String[] args) {
        book bk = new book();
        bk.id = 111;
        bk.name = "三国";
        bk.price = 200;


        book bk1 = new book();
        bk1.id = 112;
        bk1.name = "水浒";
        bk1.price = 2;


        book bk2 = new book();
        bk2.id = 113;
        bk2.name = "富婆通讯录";
        bk2.price = 20000;

        bk.xiyouji();
        bk1.xiyouji();
        bk2.xiyouji();



    }
}
