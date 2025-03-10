package com.oop;

public class ExcepptionDemo {
        public static void main(String[] args) {
            Excepption();  //
        }

    public static void Excepption() {
        try {
            // 可能产生异常的代码
            int result = 10 / 0;  // 会抛出 ArithmeticException
        } catch (ArithmeticException e) {
            // 处理异常的代码
            System.out.println("发生算术异常：" + e.getMessage());
        }
    }

}
