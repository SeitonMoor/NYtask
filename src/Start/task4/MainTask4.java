package Start.task4;

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean result = false;

        System.out.println("Введите число:");
        int N = sc.nextInt();
        sc.close();

        while (N > 0) {
            if ((N % 10) == 2) {
                result = true;
            }
            N = N / 10;
        }
        System.out.println(result);
    }
}
