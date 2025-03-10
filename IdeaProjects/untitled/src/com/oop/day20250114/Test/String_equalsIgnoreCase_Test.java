package com.oop.day20250114.Test;

import java.util.Scanner;

public class String_equalsIgnoreCase_Test {

    public static void main(String[] args) {
        //简单的写一串登录代码，账号密码错误三次，用户不可再次登录，需要输入指定命令才能继续登录
        test();
        //equalsIgnoreCase判断比较。
    }
    public static void test() {
        String str1 = "abc";
        String str2 = "123";
        String str3 = "ABC";
        int pass = 0;
        Scanner sc = new Scanner(System.in);

        lo:
        while (true) {
            System.out.println("请输入账号");
            String admin = sc.next();
            System.out.println("请输入密码");
            String PassWord = sc.next();
            if (admin.equalsIgnoreCase(str1) && PassWord.equalsIgnoreCase(str2)) {
                System.out.println("登录成功");
                break lo;
            }else {
                System.out.println("登录失败");
                pass++;
                if (pass == 3) {
                    System.out.println("登录失败账号锁定");
                    break lo;
                }
            }
        }


    }
}
