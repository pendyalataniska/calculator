import java.util.Scanner;

public class calulator {
    public static void main(String[] args) {
        // Declare variables for the two numbers, the operator, and the result
        double num1, num2, result = 0.0;
        char operator;
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user to enter the first number
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            
            // Prompt the user to enter an operator
            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);
            
            // Prompt the user to enter the second number
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
            
            // Use a switch statement to perform the selected operation
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Check for division by zero
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return; // Exit the program
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator entered.");
                    return; // Exit the program
            }
            
            // Print the result
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers and a single operator.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
