import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = input.nextInt();
        if (number%2==0){
            System.out.print("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
