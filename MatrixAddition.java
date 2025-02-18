import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for number of rows and columns
        System.out.println("Enter no of rows and columns:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Input for the first matrix
        System.out.println("Enter Matrix1:");
        int[][] matrix1 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for the second matrix
        System.out.println("Enter Matrix2:");
        int[][] matrix2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Resultant Matrix Calculation and Output
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
            }
            System.out.println(); // To move to the next row after printing each row
        }

        // Close the scanner
        scanner.close();
    }
}
