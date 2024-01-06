import java.util.Scanner;

public class AirthmeticOperators {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int add = num1 + num2;
        int multiply = num1 * num2;
        int subtraction = num1 - num2;
        int division = num1 / num2;
        int modulas = num1 % num2;

        System.out.println("Addition is :"+add);
        System.out.println("Subtraction is :"+subtraction);
        System.out.println("Division is :"+division);
        System.out.println("Multiply is :"+multiply);
        System.out.println("Modulas is :"+modulas);
    }
}
