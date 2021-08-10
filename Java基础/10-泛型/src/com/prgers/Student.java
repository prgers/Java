package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/10 4:40 下午
 */
public class Student<T> {
    private T score;

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    public <T> Student(T score) {
    }
}
