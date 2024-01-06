import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Let's Swap Two Numbers...");
        int c;
        c = num1;
        num1 = num2;
        num2 = c;
        System.out.println("After Swapping:Value of First Number is: " +num1);
        System.out.println("After Swapping:Value of Second Number is: " +num2);
    }
}
