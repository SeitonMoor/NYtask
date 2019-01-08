package Base.task1;

import java.util.Random;

public class MainBaseTask1 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        Random r = new Random();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
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

        for (int i = 0; i < 3 - 1; i++){
            for (int j = 0; j < 3 - i - 1; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[3 - 1 - j][3 - 1 - i];
                matrix[3 - 1 - j][3 - 1 - i] = tmp;
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
