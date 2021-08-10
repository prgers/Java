package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/10 3:27 下午
 */
public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculate() {
        double half = Math.PI * radius;
        area = half * radius;
        girth = half * 2;
    }
}
