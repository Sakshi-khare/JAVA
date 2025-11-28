//9. Create a class Calculator with methods add, subtract, multiply, and divide. Use objects to call
////these methods.
class Calculator {
    // Method to add
    int add(int a, int b) {
        return a + b;
    }

    // Method to subtract
    int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply
    int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }
}

// Separate class to run the program
public class CalculatorTest{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}

