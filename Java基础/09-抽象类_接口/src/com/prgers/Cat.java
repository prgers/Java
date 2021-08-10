package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/10 3:36 下午
 */
public class Cat implements Eatable{
    @Override
    public void eat(String name) {
        Eatable.super.eat(name);
        System.out.println("Cat - eat - " + name);
    }
}
