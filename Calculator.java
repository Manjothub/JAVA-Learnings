import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.print("Enter First Number:");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number:");
        int num2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter Operation(+,-,*,/):");
        String expression = input.nextLine();

        if (expression.equals("+")) {
            int sum = num1 + num2;
            System.out.println("Addition of Two Numbers is: " + sum);
        } else if (expression.equals("-")) {
            int difference = num1 - num2;
            System.out.println("Subtraction of Two Numbers is: " + difference);
        } else if (expression.equals("*")) {
            int product = num1 * num2;
            System.out.println("Multiplication of Two Numbers is: " + product);
        } else if (expression.equals("/")) {
            if (num2 != 0) {
                int quotient = num1 / num2;
                System.out.println("Division of Two Numbers is: " + quotient);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Sorry, Wrong Operation");
        }
    }
}
