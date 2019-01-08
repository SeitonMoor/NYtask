package Start.task5;

import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        System.out.println("Введите число A:");
        int A = sc.nextInt();
        System.out.println("Введите число B:");
        int B = sc.nextInt();
        sc.close();

        for (int i = A; i <= B; i++){
            result = result + i;
        }

        System.out.println("Сумма всех чисел от A до B включительно: " + result);
    }
}
