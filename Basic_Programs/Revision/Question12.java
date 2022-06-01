package Revision;
import java.util.Scanner;
// Q Write a Java program to swap two variables
public class Question12 {
    public static void main(String[] args){
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number:");
        a = in.nextInt();
        System.out.println("Enter Second Number:");
        b = in.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping the Values: " + a +" and "+ b);
    }
}
