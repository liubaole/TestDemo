package com.oop.day20250114.Test;
import java.util.ArrayList;
import java.util.Arrays;


import com.oop.day20250114.cinema.Movie;

public class Test {
    public static void main(String[] args) {
        //调用Movie类里面的Movie方法，将数据都塞进去
        Movie movie1 = new Movie(1,"东八区的先生们","2022",2.1,"中国大陆","喜剧","夏睿","张翰，王晓晨");
        Movie movie2 = new Movie(2,"上海堡垒","2019",2.9,"中国大陆","爱情","滕华涛","鹿晗，舒淇");
        Movie movie3 = new Movie(3,"纯洁心灵逐·梦演艺圈","2015",2.2,"中国大陆","剧情","毕志飞","朱一飞，李艳满");
        //创建一个数组
        ArrayList<Movie> movies = new ArrayList<>();
//        movies.add(movie1);
        //和上面是一个意思，将数据都塞进数组里面
        movies.addAll(Arrays.asList(movie1, movie2, movie3));
        //调用movieService类里面的MovieService方法，将数组数据都传输过去
        MovieService movieService = new MovieService(movies);

        movieService.start();
    }
}
