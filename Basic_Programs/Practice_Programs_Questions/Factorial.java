package Practice_Programs_Questions;
import java.util.*;
 // What is Factorial ?
// Factorial of a number is the product of all the positive numbers less than or equal to the number. The factorial of a number n is denoted by n!

public class Factorial {

    static int fact(int n){
        int output;
        if(n==1){
            return 1;
        }
        // By using the recursion function
        output = fact(n-1)*n;
        return output;
    }
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Factorial Checker");
        System.out.print("Enter a Number :");
        int num = reader.nextInt();
        int factorial = fact(num);
        System.out.print("Factorial of Your Entered Number is :" + factorial);
    }

}
