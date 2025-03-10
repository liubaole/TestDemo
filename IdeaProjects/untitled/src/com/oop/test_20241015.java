package com.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class test_20241015 {

    private static final int RED_BALL_COUNT = 6;
    private static final int TOTAL_RED_BALLS = 33; // 红球号码范围 1-33
    private static final int TOTAL_BLUE_BALLS = 16; // 蓝球号码范围 1-16

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 生成中奖号码
        List<Integer> winningNumbers = generateWinningNumbers();
        System.out.println("中奖号码为: " + winningNumbers);

        // 用户输入自己的号码
        List<Integer> userNumbers = getUserNumbers(scanner);

        // 进行比较
        compareNumbers(userNumbers, winningNumbers);

        scanner.close();
    }

    // 生成中奖号码
    private static List<Integer> generateWinningNumbers() {
        List<Integer> redBalls = new ArrayList<>();
        Random random = new Random();

        // 生成红球号码
        while (redBalls.size() < RED_BALL_COUNT) {
            int num = random.nextInt(TOTAL_RED_BALLS) + 1; // 1到33
            if (!redBalls.contains(num)) {
                redBalls.add(num);
            }
        }
        Collections.sort(redBalls);

        // 生成蓝球号码
        int blueBall = random.nextInt(TOTAL_BLUE_BALLS) + 1; // 1到16

        redBalls.add(blueBall); // 将蓝球添加到红球号码列表的最后
        return redBalls;
    }

    // 获取用户的号码
    private static List<Integer> getUserNumbers(Scanner scanner) {
        List<Integer> userBalls = new ArrayList<>();
        System.out.println("请输入6个红球号码（1-33），用空格分隔:");
        while (userBalls.size() < RED_BALL_COUNT) {
            int num = scanner.nextInt();
            if (num < 1 || num > TOTAL_RED_BALLS) {
                System.out.println("号码必须在1到33之间，请重新输入:");
                continue;
            }
            if (!userBalls.contains(num)) {
                userBalls.add(num);
            } else {
                System.out.println("您已选择该号码，请选择其他号码:");
            }
        }
        Collections.sort(userBalls);

        // 添加蓝球号码
        System.out.println("请输入1个蓝球号码（1-16）:");
        int blueBall = scanner.nextInt();
        while (blueBall < 1 || blueBall > TOTAL_BLUE_BALLS) {
            System.out.println("蓝球号码必须在1到16之间，请重新输入:");
            blueBall = scanner.nextInt();
        }
        userBalls.add(blueBall);

        return userBalls;
    }

    // 比较号码
    private static void compareNumbers(List<Integer> userNumbers, List<Integer> winningNumbers) {
        List<Integer> userRedBalls = userNumbers.subList(0, RED_BALL_COUNT);
        int userBlueBall = userNumbers.get(RED_BALL_COUNT);

        List<Integer> winningRedBalls = winningNumbers.subList(0, RED_BALL_COUNT);
        int winningBlueBall = winningNumbers.get(RED_BALL_COUNT);

        int matchCount = 0;
        for (int num : userRedBalls) {
            if (winningRedBalls.contains(num)) {
                matchCount++;
            }
        }

        System.out.println("您选择的红球号码为: " + userRedBalls + " 蓝球号码为: " + userBlueBall);
        System.out.println("中奖红球号码为: " + winningRedBalls + " 中奖蓝球号码为: " + winningBlueBall);
        System.out.println("您中奖的红球数量: " + matchCount);

        if (userBlueBall == winningBlueBall) {
            System.out.println("恭喜您，您还中了蓝球！");
        } else {
            System.out.println("您没有中蓝球。");
        }
    }
}
