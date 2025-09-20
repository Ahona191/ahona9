public class Calculator {

    // Add method
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide method
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Main method to test the Calculator
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}
