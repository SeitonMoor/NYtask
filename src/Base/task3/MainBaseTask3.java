package Base.task3;

import java.util.Random;

public class MainBaseTask3 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        Random r = new Random();

        System.out.println("Matrix №1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = r.nextInt(9);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matrix №1(после транспонирования):");
        for (int i = 0; i < 3; i++){
            for (int j = i + 1; j < 3; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
