package com.oop.day20250114.Test;

import java.util.Scanner;

public class String_replace_test {

    //敏感词屏蔽
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String tmd = s.replace("TMD", "***");//replace查询出来一样的字符做替换。
        System.out.println(tmd);
    }
}
