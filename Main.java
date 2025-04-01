import java.util.Random;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        Random rm = new Random();
        int[][] colors = new int[SIZE][SIZE];
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                colors[i][j] = rm.nextInt(256);
            }
        }

        System.out.println("Дана следующая матрица:");
        printMatrix(colors);

        int[][] rotatedColors = new int[SIZE][SIZE];
        for (int i = 0; i < rotatedColors.length; i++) {
            for (int j = 0; j < rotatedColors[i].length; j++) {
                rotatedColors[i][j] = colors[SIZE - 1 - j][i];
            }
        }

        System.out.println("Вывод:");
        printMatrix(rotatedColors);
    }

    private static void printMatrix(int[][] colors) {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.printf("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }
}
