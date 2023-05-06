import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
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
}