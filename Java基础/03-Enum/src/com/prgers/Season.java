package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/9 4:20 下午
 */
public enum Season {
    SPRING(1, 3),
    SUMMER(4,6),
    FALL(7, 9),
    WINTER(10, 12);
//    SPRING, SUMMER, FALL, WINTER

    private int startMonth;
    private int endMonth;

    Season(int startMonth, int endMonth) {
        this.startMonth = startMonth;
        this.endMonth = endMonth;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public int getEndMonth() {
        return endMonth;
    }
}
