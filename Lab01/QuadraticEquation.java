import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve quadratic equation: ax^2 + bx + c = 0");

        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinitely many solutions!");
                } else {
                    System.out.println("The equation has no solution!");
                }
            } else {
                double x = -c / b;
                System.out.println("This is a linear equation. The solution is:");
                System.out.println("x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct real roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {  
                double x = -b / (2 * a);
                System.out.println("The equation has one double root:");
                System.out.println("x = " + x);
            } else {
                System.out.println("The equation has no real solutions!");
            }
        }

        scanner.close();
    }
}