package Revision;
import java.util.Scanner;

// Q Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

public class Question10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input First Number:");
        int num1 = in.nextInt();
        System.out.print("Input Second Number:");
        int num2 = in.nextInt();
        System.out.print("Input Third Number:");
        int num3 = in.nextInt();
        System.out.println("The Average is :"+ (num1+num2+num3)/3);
    }
}
