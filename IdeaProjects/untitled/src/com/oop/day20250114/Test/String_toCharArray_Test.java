package com.oop.day20250114.Test;

import java.util.Scanner;

public class String_toCharArray_Test {
    public static void main(String[] args) {

        test();
    }
    private static void test(){
        //1键盘录入一串字符
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();//字符串转换为数组

        int shuzi = 0;
        int da = 0;
        int xiao = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >'0' && chars[i] < '9') {
                shuzi++;
            }else if (chars[i] >'A' && chars[i] < 'Z') {
                da++;
            }else if (chars[i] >'a' && chars[i] < 'z') {
                xiao++;
            }
        }
        System.out.println("您输入的数字有："+shuzi);
        System.out.println("您输入的小写有："+xiao);
        System.out.println("您输入的大写有："+da);

    }
}
