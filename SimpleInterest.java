import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // (PxTxR)/100
        Scanner input = new Scanner(System.in);
        System.out.print("Enter P:");
        int P = input.nextInt();
        System.out.print("Enter T:");
        int T = input.nextInt();
        System.out.print("Enter R:");
        float R = input.nextFloat();

        float Compound = (P*T*R)/100;
        System.out.println("Compound Interest is: " + Compound);
    }
}
