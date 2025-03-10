package com.oop;
import java.util.Random;
import java.util.*;
public class RandomDome {
    /*
    * 随机验证码
    * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();  //用Arrays创建一个数组，
        Random rand = new Random();                  //random随机包使用


        System.out.println("输入1随机选择您的职业");
        Scanner sc = new Scanner(System.in);
        int profession = sc.nextInt();

        list.addAll(Arrays.asList("战士","刺客","法师","射手","坦克"));//往list数组里面导入人物详细信息

        if (profession == 1){
            int index = rand.nextInt(list.size());              //随机list数组长度，例如：数组长10就随机10
            if (index == 0){
            //练习结束。






            }

        }

//        System.out.println(list.get(0));                //打印数组，随机获取数组长长度信息
    }
}
