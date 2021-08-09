/**
 * @Author prgers
 * @Date 2021/8/9 2:49 下午
 */
public class Main {
    public static void main(String[] args) {

        test3(1,2,3);

    }

    public static void test1() {
        /**
         * >> 有符号右移,最左用符号位补齐
         * >>> 无符号右移,最左用0补齐
         */
        System.out.println(Integer.toBinaryString(-128));           //11111111111111111111111110000000
        System.out.println(Integer.toBinaryString(-128 >> 2));      //11111111111111111111111111100000
        System.out.println(Integer.toBinaryString(-128 >>> 2));     //00111111111111111111111111100000
    }

    public static void test2() {
        int[] arr1;
        int[] arr2 = {};    //推荐
        int arr3[] = {};    //不推荐

        int[] arr4 = new int[] {1,2,3,4,5};
        int arr5[] = {1,2,3,4,5};

        int[] arr6 = new int[6];

        for (int i = arr4.length - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void  test3(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, double b) {
        return  a + (int) b;
    }

    public static int sum(int a) {
        return sum(a, 0);
    }
}
