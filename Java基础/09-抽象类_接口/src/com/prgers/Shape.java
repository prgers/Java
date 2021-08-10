package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/10 3:21 下午
 */
public abstract class Shape {
    protected double area;
    protected double girth;

    public double getArea() {
        return area;
    }

    public double getGirth() {
        return girth;
    }

    public void show() {
        calculate();
        System.out.println(area + "_" + girth);
    }

    protected abstract void calculate();
}
