import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Решение задачи №1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println(Arrays.toString(a));
        double[] s = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(s));
        byte[] c = new byte[]{1, 2, 4, 5, 6};
        System.out.println(Arrays.toString(c));
    }

    public static void task2() {
        System.out.println("Решение задачи №2");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] s = {1.57, 7.654, 9.986};
        byte[] c = new byte[]{1, 2, 4, 5, 6};
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ",");
        }
        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1) {
                System.out.println(s[i]);
                break;
            }
            System.out.print(s[i] + ",");
        }
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ",");
        }
    }
}