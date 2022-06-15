package Revision;
import java.util.*;


// Write a Program to pass parameters within functions

public class Methods_2 {
//    static void Check(String fname , int age){
//        System.out.println("Hello " +fname + " Welcome to JAVA");
//        System.out.println("Hello " +fname + " You are Age is " +age);
//    }
    static void CheckAge(){
        Scanner age = new Scanner(System.in);
        System.out.print("Voting Age Checker");
        System.out.print("Enter your Age :");
        int a = age.nextInt();

        if (a >= 18){
            System.out.println("Wohoo you are Eligible for Voting");
        }
        else{
            System.out.println("Sorry , You are not Eligible for Voting");
        }
    }
    public static void main(String[] args){
//        Check("Manjot Singh" , 22);
        CheckAge();
    }
}
