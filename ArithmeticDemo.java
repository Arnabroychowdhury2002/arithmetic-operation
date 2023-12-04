class Arithmetic {
    // Method to add two numbers
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract num2 from num1
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide num1 by num2
    public double divide(double num1, double num2) {
        // Check for division by zero
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Return NaN (Not a Number) for an undefined result
        }
    }
}

public class ArithmeticDemo {
    public static void main(String[] args) {
        // Creating an object of the Arithmetic class
        Arithmetic calculator = new Arithmetic();

        // Example values
        double operand1 = 10.0;
        double operand2 = 5.0;

        // Perform operations and print the results
        System.out.println("Addition: " + calculator.add(operand1, operand2));
        System.out.println("Subtraction: " + calculator.subtract(operand1, operand2));
        System.out.println("Multiplication: " + calculator.multiply(operand1, operand2));
        System.out.println("Division: " + calculator.divide(operand1, operand2));
    }
}

