package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/10 3:43 下午
 */
public interface Runnable {

    default void run() {
        System.out.println("Runnable - run");
    }
}
