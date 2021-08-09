package com.prger;

/**
 * @Author prgers
 * @Date 2021/8/9 4:09 下午
 */
public class Student extends Person{

    static {//静态初始化块
        System.out.println("Student static block");
    }

    {//初始化块
        System.out.println("Student block");
    }

    public Student() {
        System.out.println("Student init()");
    }
}
