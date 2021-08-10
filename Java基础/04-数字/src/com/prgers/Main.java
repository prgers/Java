package com.prgers;

import java.util.Random;

/**
 * @Author prgers
 * @Date 2021/8/9 10:16 下午
 */
public class Main {
    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        Random r = new Random();
        r.nextBoolean();
        r.nextInt();
        r.nextLong();
        r.nextFloat();

        //生成[0, 99]范围的整数
        int num1 = (int) (Math.random() *100);
        int num2 = new Random().nextInt(100);
        System.out.println(num2);

        //生成[10, 99]范围的整数
        int num3 = new Random().nextInt(100) + 10;
    }

    public static void test1() {
        Integer i1 = 88;
        Integer i2 = 88;
        Integer i3 = 888;
        Integer i4 = 888;

        //不推荐
        System.out.println(i1 == i2); //true
        System.out.println(i3 == i4); //false

        //推荐
        System.out.println(i1.equals(i2)); //true
        System.out.println(i3.equals(i4)); //true
    }
}
