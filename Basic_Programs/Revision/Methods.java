package Revision;
import java.util.*;

public class Methods {
    static void Sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = in.nextInt();
        Scanner nm = new Scanner(System.in);
        System.out.println("Enter Second Number: ");
        int b = nm.nextInt();
        int c = a+b;
        System.out.println("The Sum of the Two Numbers are: " + c );
    }

    public static void main(String[] args){
        Sum();
        Sum();
        Sum();
    }
}
