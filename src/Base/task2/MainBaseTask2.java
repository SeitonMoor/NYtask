package Base.task2;

import java.util.Random;

public class MainBaseTask2 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        int[][] matrix1 = new int[3][3];
        Random r = new Random();

        System.out.println("Matrix №1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = r.nextInt(9);
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix №2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = r.nextInt(9);
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("%3d ", matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Matrix №3 (получилась в результате умножения матриц №1 и №2):");
        int[][] matrix2 = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix2[i][j] = 0;
                for (int k = 0; k < 3; k++){
                    matrix2[i][j] += matrix[i][k] * matrix1[k][j];
                }
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("%3d ", matrix2[i][j]);
            }
            System.out.println();
        }
    }
}
