package com.oop;

public class xiaomiTest {
    public static void main(String[] args) {
        xiaomi test = new xiaomi();
        test.brand = "小米note";
        test.color  = "白色";
        test.price = 4999;

        System.out.println(test.brand);
        System.out.println(test.color);
        System.out.println(test.price);

        xiaomi test2 = new xiaomi();
        test2.brand = "华为note";
        test2.color  = "黑色";
        test2.price = 8999;

        System.out.println(test2.brand);
        System.out.println(test2.color);
        System.out.println(test2.price);


        test.call("zhangsan");
        test.sendMessage();
        test2.call("lisi");
        test2.sendMessage();

    }
}
