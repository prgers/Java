package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/9 10:31 下午
 */
public class Main {
    public static void main(String[] args) {
        fun2();
    }

    public static void fun2() {
        int a = 1, b = 2, c = 3;
        String s1 = String.format("%d%d%d", a, b, c);
        String s2 = String.format("%d%d%d", a, b, c);
        String s3 = s1.intern();
        String s4 = s2.intern();
        String s5 = "123";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
    }

    public static void fun1() {
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
