import java.util.Arrays;

public class DZ1_3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1 ");
        int[] a = {1, 2, 3};
        int length = 0;
        for (int element : a) {
            length++;
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(a[i] + ",");
        }
    }

    public static void task2() {
        System.out.println("\nЗадание 2 ");
        double[] weights = {1.57, 7.654, 9.986};
        int length = 0;
        for (double element : weights) {
            length++;
        }
        for (int o = length - 1; o >= 0; o--)
            System.out.print(weights[o] + ",");
    }

    public static void task3() {
        System.out.println("\nЗадание 3 ");
        int[] num = {0, 1, 2, 3, 4};
        int length = 0;
        for (int element : num) {
            length++;
        }
        for (int t = length - 1; t >= 0; t--)
            System.out.print(Arrays.toString(num));
    }

    public static void task4() {
        System.out.println("\nЗадание 4 ");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }
            System.out.println(Arrays.toString(arr1));
        }
    }
}

