package Revision;
import java.util.Scanner;
// Q7 Write a Java program that takes a number as input and prints its multiplication table upto 10
public class Question7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number to see Multiplication Table:");
        int num1 = in.nextInt();

        for (int i=0; i< 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }
    }
}
