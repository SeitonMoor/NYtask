package Start.task1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class MainTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число №1:");
        int number = sc.nextInt();
        System.out.println("Введите число №2:");
        int number1 = sc.nextInt();
        System.out.println("Введите число №3:");
        int number2 = sc.nextInt();
        sc.close();

        int min = Collections.min(Arrays.asList(number, number1, number2));
        int max = Collections.max(Arrays.asList(number, number1, number2));

        System.out.println("Наименьшее из введеных вами чисел: " + min);
        System.out.println("Наибольшее из введеных вами чисел: " + max);
    }
}
