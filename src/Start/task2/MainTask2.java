package Start.task2;

import java.util.Scanner;

import java.util.Arrays;

public class MainTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result;

        System.out.println("Введите число №1:");
        int number = sc.nextInt();
        System.out.println("Введите число №2:");
        int number1 = sc.nextInt();
        System.out.println("Введите число №3:");
        int number2 = sc.nextInt();
        sc.close();

        int[] array = new int[]{number, number1, number2};
        Arrays.sort(array);
        result = array[1] + array[2];

        System.out.println("Сумма двух наибольших чисел: " + result);
    }
}
