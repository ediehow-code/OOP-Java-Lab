import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Row: ");
        int row = scanner.nextInt();

        System.out.print("Col: ");
        int col = scanner.nextInt();

        double[][] matA = new double[row][col]; 
        double[][] matB = new double[row][col];
        double[][] matC = new double[row][col]; 

        System.out.println("\nEnter matrix A (left - right, top - bottom): ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matA[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nEnter matrix B (left - right, top - bottom): ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matB[i][j] = scanner.nextDouble();
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        System.out.println("\nmatA + matB = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matC[i][j] + " ");
            }
            System.out.println(); 
        }
        scanner.close();
    }
}