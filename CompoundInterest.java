import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter P: ");
        double P = input.nextDouble();
        System.out.print("Enter R: ");
        double R = input.nextDouble();
        System.out.print("Enter T: ");
        int T = input.nextInt();

        // Using Math.pow to calculate the power in the formula
        double Interest = P * Math.pow((1 + R / 100), T);

        System.out.println("Compound Interest is: " + Interest);
    }
}
