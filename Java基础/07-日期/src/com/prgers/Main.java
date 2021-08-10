package com.prgers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author prgers
 * @Date 2021/8/10 10:35 上午
 */
public class Main {
    public static void main(String[] args) {
        demo3();
    }

    public static void demo3() {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str = fmt.format(new Date());
        System.out.println(str);

        try {
            Date date = fmt.parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static void demo2() {
        Date date1 = new Date();
        Date date2 = new Date();

        date1.setTime(1000);
        date2.setTime(2000);
        System.out.println(date1);
        System.out.println(date2);

        System.out.println(date1.before(date2));
        System.out.println(date2.after(date1));
        System.out.println(date1.compareTo(date2));
    }

    public static void demo1() {
        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(System.currentTimeMillis());
        System.out.println(date2);
    }
}
