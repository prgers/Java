package com.prgers;

/**
 * @Author prgers
 * @Date 2021/8/10 10:01 上午
 */
public class Main {
    public static void main(String[] args) {
//        Integer num = new Integer("abc");
//        System.out.println(num);

//        Object obj = "12.34";
//        Double d = (Double) obj;
//        System.out.println(d);
        
//        Integer[] nums = {1, null, 2};
//        for (Integer num : nums) {
//            System.out.println(num);
//        }

//        System.out.println(1);
//        try {
//            System.out.println(2);
//            Integer num = new Integer("abc");
//            System.out.println(3);
//        } catch (NumberFormatException e) {
//
//            System.out.println(4);
//            System.out.println(e.getMessage());
//            System.out.println(e);
//            e.printStackTrace();
//        } finally {
//            System.out.println(5);
//        }
//        System.out.println(6);

        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println(i + "_try_1");
                if (i == 2) continue;;
                System.out.println(i + "_try_2");
            } finally {
                System.out.println(i + "_finally");
            }
        }

    }
}
