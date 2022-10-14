public class DZ1 {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        double[] weights = {1.57, 7.654, 9.986, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        weights[0] = 1.57;
        weights[11] = 0;
        for (int i = 0; i < 12; i++)
            System.out.println(weights[i]);

        int[] num = {0, 1, 2, 3, 4};
        num[0] = 0;
        num[4] = 4;
        for (int t = 0; t < 5; t++)
            System.out.print(num[t]);
    }
}
