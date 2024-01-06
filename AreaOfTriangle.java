import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter B: ");
        int B = input.nextInt();
        System.out.print("Enter H: ");
        int H = input.nextInt();

        // Use 1.0 instead of 1 to perform floating-point division
        double Area = 0.5 * B * H;

        System.out.println("Area of Triangle is: " + Area);
    }
}
