import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to Coding Class");
    }
}
