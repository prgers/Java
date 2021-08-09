package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/9 4:19 下午
 */
public class Main {
    public static void main(String[] args) {

//        Season season = Season.SPRING;
//        season = Season.SUMMER;
//        switch (season) {
//            case SPRING:
//                System.out.println("春天");
//                break;
//            case SUMMER:
//                System.out.println("夏天");
//                break;
//            case FALL:
//                System.out.println("秋天");
//                break;
//            case WINTER:
//                System.out.println("冬天");
//                break;
//        }

        Season season = Season.SPRING;
        System.out.println(season.getStartMonth());
        System.out.println(season.getEndMonth());

    }
}
