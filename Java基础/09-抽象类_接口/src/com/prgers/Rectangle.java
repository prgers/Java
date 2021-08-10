package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/10 3:24 下午
 */
public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected void calculate() {
        area = width * height;
        girth = (width + height) * 2;
    }
}
