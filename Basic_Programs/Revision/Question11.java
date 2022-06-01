package Revision;
import java.util.Scanner;

// Q Write a Java program to print the area and perimeter of a rectangle
public class Question11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Width: ");
        float width = in.nextFloat();
        System.out.println("Enter Height: ");
        float height = in.nextFloat();
        System.out.println("Let's Print Area of Triangle");
        float result = width*height;
        System.out.println("Area is:" + result);
        float p = 2*(width+height);
        System.out.println("Perimeter of Rectangle is :" + p);
    }
}
