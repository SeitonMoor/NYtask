package Start.task8;

import java.util.Scanner;

public class MainTask8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        System.out.println("Введите число:");
        int N = sc.nextInt();
        sc.close();

        while (N > 0) {
            result = result + N % 10;
            N = N / 10;
        }
        System.out.println("Сумма всех цифр числа: " + result);
    }
}
