import java.util.Scanner;

public class LinearSystemWithTwoVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve linear system with two variables");

        System.out.print("Enter a11, a12, b1, a21, a22, b2: ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1  = scanner.nextDouble();
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2  = scanner.nextDouble();

        // Calculate determinants (Cramer's Rule)
        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            // Unique solution
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The system has a unique solution:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            // D == 0
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        }

        scanner.close();
    }
}