package com.prger;

/**
 * @Author prgers
 * @Date 2021/8/9 4:12 下午
 */
public class Rocket {
    private static final Rocket instance = new Rocket();
    private Rocket(){}
    public static Rocket getInstance() {
        return instance;
    }
}
