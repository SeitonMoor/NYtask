package Start.task3;

import java.util.Arrays;
import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число №1:");
        int number = sc.nextInt();
        System.out.println("Введите число №2:");
        int number1 = sc.nextInt();
        System.out.println("Введите число №3:");
        int number2 = sc.nextInt();
        sc.close();

        int[] array = new int[]{number, number1, number2};
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
