package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/9 10:31 下午
 */
public class Main {
    public static void main(String[] args) {
        String s = "555";
        s += "555";
        s = "666";
        test(s);
        System.out.println(s);
    }

    public static void test(String str) {
        str += "555";
    }
}
