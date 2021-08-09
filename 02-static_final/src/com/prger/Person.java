package com.prger;

/**
 * @Author prgers
 * @Date 2021/8/9 3:55 下午
 */
public class Person {
    static {//静态初始化块
        System.out.println("Person static block");
    }

    {//初始化块
        System.out.println("Person block");
    }

    public Person() {
        System.out.println("Person init()");
    }
}
