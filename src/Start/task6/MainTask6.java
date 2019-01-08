package Start.task6;

import java.util.Scanner;

public class MainTask6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        int N = sc.nextInt();
        sc.close();

        int A1 = 1;
        int A2 = 2;
        int A3 = 3;
        System.out.print(A1 + " " + A2 + " " + A3 + " ");

        for (int i = 4; i <= N; i++) {
            int Ak = A3 + A2 - 2 * A1;
            System.out.print(Ak + " ");
            A1 = A2;
            A2 = A3;
            A3 = Ak;
        }
    }
}
