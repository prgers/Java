package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/10 4:39 下午
 */
public class Main {
    public static void main(String[] args) {
        Student<String> stu1 = new Student<>("A");
        stu1.setScore("A");
        set(stu1, "B");
        System.out.println(stu1.getScore());
    }

    public static <T> void set(Student<T> stu, T score) {
        stu.setScore(score);
    }
}
