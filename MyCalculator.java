import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Step 2: Get the first number from the user
        System.out.print("Enter the first number: ");
        double num1 = getValidNumber(scanner);

        // Step 3: Get the second number from the user
        System.out.print("Enter the second number: ");
        double num2 = getValidNumber(scanner);

        // Step 4: Perform addition and display the result
        double sumResult = num1 + num2;
        System.out.println("Sum: " + sumResult);

        // Step 5: Perform subtraction and display the result
        double subtractResult = num1 - num2;
        System.out.println("Subtraction: " + subtractResult);

        // Step 6: Perform multiplication and display the result
        double multiplyResult = num1 * num2;
        System.out.println("Multiplication: " + multiplyResult);

        // Step 7: Perform division and display the result (handling division by zero)
        if (num2 != 0) {
            double divideResult = num1 / num2;
            System.out.println("Division: " + divideResult);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        }

        // Step 8: Close the scanner to release resources
        scanner.close();
    }

    // Helper method to get a valid number from the user
    private static double getValidNumber(Scanner scanner) {
        // Step 1: Check if the input is a valid double
        while (!scanner.hasNextDouble()) {
            // Step 2: If not valid, inform the user and ask for input again
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Consume the invalid input
        }

        // Step 3: Return the valid double
        return scanner.nextDouble();
    }
}