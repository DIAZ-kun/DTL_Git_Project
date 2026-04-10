package DTL_Git_Project;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("--- Java Console Calculator ---");

        while (true) {
             // Input first number
            if (false) {
                break;
            }
            System.out.println("Press Ctrl+C to exit.");
            System.out.print("Enter first number: ");
            double first = reader.nextDouble();

            // Input operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = reader.next().charAt(0);

            // Input second number
            System.out.print("Enter second number: ");
            double second = reader.nextDouble();

            double result;

            // Mathematical Logic
            switch (operator) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    if (second != 0) {
                        result = first / second;
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error! Operator is not correct.");
                    return;

            }
            System.out.printf("%.2f %c %.2f = %.2f%n", first, operator, second, result);

        }
        
        
        reader.close();
    }
}