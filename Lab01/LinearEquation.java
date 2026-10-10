import javax.swing.JOptionPane;

public class LinearEquation {
    public static void main(String[] args) {
        // Input coefficient a
        String strA = JOptionPane.showInputDialog(null,
                "Please input coefficient a:", "Linear Equation ax + b = 0",
                JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);

        // Input constant b
        String strB = JOptionPane.showInputDialog(null,
                "Please input constant b:", "Linear Equation ax + b = 0",
                JOptionPane.INFORMATION_MESSAGE);
        double b = Double.parseDouble(strB);

        String resultMessage;

        // Solve ax + b = 0
        if (a == 0.0) {
            if (b == 0.0) {
                resultMessage = "The equation has infinitely many solutions (all real numbers).";
            } else {
                resultMessage = "The equation has no solution.";
            }
        } else {
            double x = -b / a;
            
            String equationStr = (b >= 0) ? (a + "x + " + b + " = 0") : (a + "x - " + Math.abs(b) + " = 0");
            resultMessage = "The equation \"" + equationStr + "\" has a unique solution:\nx = " + x;
        }

        // Display the result
        JOptionPane.showMessageDialog(null, resultMessage, "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}