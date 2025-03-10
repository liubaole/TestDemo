package com.oop.day20250114.Test;

import com.oop.day20250114.cinema.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieService {

    private ArrayList<Movie> movies;  //创建了一个新的private（只能在这个类内使用的数组）
    private Scanner sc = new Scanner(System.in);

    public MovieService(ArrayList<Movie> movies) {
        //数组数据传输过来之后，因为只能在这个方法内部使用，我们要把他变全局变量，
        // 所以，先创建一个全局的数组，再将数据传世过去
        //下面的代码解释的是    新数组 = 传输过来的数组。
        this.movies = movies;
    }

    public void start() {


        //启动电影信息管理系统
        lo:
        while (true) {
            System.out.println("------电影信息系统----------");
            System.out.println("请输入您的选择：");
            System.out.println("1 查询全部电影信息");
            System.out.println("2 根据id查询电影信息");
            System.out.println("3 exit");


            int choice = sc.nextInt();
//            String dy = sc.next();
            switch (choice) {
                case 1:
//                    System.out.println("查询全部电影信息，首页");
                    qureyMovieInfos();
                    break;
                case 2:
//                    System.out.println("搜索，根据id查询电影信息");
                    queryMovieInfoByid();
                    break;
                case 3:
                    System.out.println("exit");
                    break lo;

                case 4:
//                    System.out.println("请输入您想查看的主演名称");
                    queryMovieInfoStarring();
                    break;


                default:
                    System.out.println("您输入的信息有误");
                    break;
            }
        }
    }

    private void queryMovieInfoStarring() {
        System.out.println("请输入您想查看的主演名称");

//        Scanner sc = new Scanner(System.in);
        String starringID = sc.next();


        boolean found = false;  // 标志位，判断是否找到主演

        for (Movie movie : movies) {
            if (movie.getStarring().equals(starringID)) {
                System.out.println(movie.getTitle());
                found = true;  // 找到后更新标志位
                break;  // 找到后退出循环
            }
        }

        if (!found) {
            System.out.println("没有找到相关电影");
        }
    }


    //根据电影编号，查询电影的详情信息
    private void queryMovieInfoByid() {
        System.out.println("请输入您要查询的电影的id");
        int movieId = sc.nextInt();
        for (Movie movie : movies) {
            if (movie.getId() == movieId) {
                System.out.println(movie.getId()+"---"+movie.getTitle()+"---"+movie.getTime()
                        +"---"+movie.getScore()+"---"+movie.getArea()+"---"+movie.getType()+"---"+movie.getDirector()+"---"+movie.getStarring());
             return;
            }
        }
        //如果return到这里说明没有根据id找到电影
        System.out.println("没找到");
    }


    /*
    * 打印电影所有信息（电影名称+评分+演员+导演）*/
    private void qureyMovieInfos() {
        for (int i= 0; i< movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println(movie.getTitle()+"---"+"导演"+movie.getDirector()+"------"+movie.getStarring()+"参演"+"------"+movie.getScore());
        }
    }
}
