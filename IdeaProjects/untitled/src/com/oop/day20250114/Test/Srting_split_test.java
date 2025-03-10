package com.oop.day20250114.Test;

public class Srting_split_test {

    //split根据正则表达式进行切片
    //先正常使用，后来发现没有自己想要的结果的时候加//斜线
    public static void main(String[] args) {
        String name = "120,0,0,1";

        String[] split = name.split(",");  //这个地方的切片规则是正则表达式进行
        System.out.println(split[1]);
    }
    }
