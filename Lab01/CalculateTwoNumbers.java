import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;

        // Input numbers
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number:", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number:", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        // Operation choice
        String operation = JOptionPane.showInputDialog(null,
                "Choose the operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division",
                "Select Operation", JOptionPane.INFORMATION_MESSAGE);
        int op = Integer.parseInt(operation);

        String resultMessage = "";

        switch (op) {
            case 1:
                resultMessage = "Sum: " + (num1 + num2);
                break;
            case 2:
                resultMessage = "Difference: " + (num1 - num2);
                break;
            case 3:
                resultMessage = "Product: " + (num1 * num2);
                break;
            case 4:
                if (num2 != 0) {
                    resultMessage = "Quotient: " + (num1 / num2);
                } else {
                    resultMessage = "Error: Divisor cannot be 0!";
                }
                break;
            default:
                resultMessage = "Invalid operation selected.";
                break;
        }

        // Display the result
        JOptionPane.showMessageDialog(null, resultMessage, "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}