package com.oop.day20250114.Test;

import java.util.Scanner;

public class StringTestTP {

    //手机号屏蔽中间四位数
            //substring,截取字符串其中的几个字符
            //有返回值的需要接收一下。
    public static void main(String[] args) {
        tast();

    }

    public static void tast() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String shou =  s.substring(0,4);
        String wei = s.substring(7);
        System.out.println(shou + "****"+wei);

    }
}
