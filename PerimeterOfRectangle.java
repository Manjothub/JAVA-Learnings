import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A:");
        int A = input.nextInt();
        System.out.print("Enter B:");
        int B = input.nextInt();
        System.out.print("Enter C:");
        int C = input.nextInt();
        System.out.print("Enter D:");
        int D = input.nextInt();

        int Perimeter = A+B+C+D;
        System.out.println("Perimeter of Rectangle is: "+ Perimeter);
    }
}
