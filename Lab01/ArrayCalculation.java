import java.util.Scanner;
import java.util.Arrays; 

public class ArrayCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("\nNumber of elements in array:");
            n = scanner.nextInt();

            if (n < 1) {
                System.out.print("Invalid");
            } else {
                break;
            }
        }
        
        double[] arr = new double[n]; 

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextDouble();
        }

        Arrays.sort(arr);

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = sum / n;

        System.out.println("Sorted array: ");
        for (double i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nSum of all array elements: " + sum);
        System.out.print("\nAverage value of array elements: " + avg);
        scanner.close();
    }
}