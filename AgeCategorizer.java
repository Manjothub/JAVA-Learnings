import java.util.Scanner;

public class AgeCategorizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();

        if (age >= 13 && age <= 19) {
            System.out.println("You are Teen");
        } else if (age <= 60) {
            System.out.println("You are Adult");
        } else {
            System.out.println("You are Senior");
        }
    }
}
