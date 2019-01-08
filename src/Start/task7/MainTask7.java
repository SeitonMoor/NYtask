package Start.task7;

import java.util.Scanner;

public class MainTask7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число A:");
        int A = sc.nextInt();
        System.out.println("Введите число B:");
        int B = sc.nextInt();
        sc.close();

        for (int i = A; i <= B; i++){
            for (int j = 1; j <= i - A + 1; j++){
                System.out.print(i + " ");
            }
        }
    }
}
