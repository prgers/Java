package com.prger;

/**
 * @Author prgers
 * @Date 2021/8/9 3:52 下午
 */
public class Main {


    public static void main(String[] args) {

//        new Person();
//        System.out.println("---------------");
//        new Student();
        Rocket rocket1 = Rocket.getInstance();
        Rocket rocket2 = Rocket.getInstance();
        Rocket rocket3 = Rocket.getInstance();
        Rocket rocket4 = Rocket.getInstance();
        System.out.println(rocket1);
        System.out.println(rocket2);
        System.out.println(rocket3);
        System.out.println(rocket4);
    }
}
