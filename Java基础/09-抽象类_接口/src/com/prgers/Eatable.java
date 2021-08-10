package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/10 3:34 下午
 */
public interface Eatable {
    default void eat(String name) {
        System.out.println("Eatable - eat - " + name);
    }
}
