import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        float number = input.nextFloat();
        if (number > 0){
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
    }
}
