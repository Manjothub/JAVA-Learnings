package Practice_Programs_Questions;
import java.util. *;
public class Calculator {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in); // Here we assigned a object which can be used for taking the inputs and act as scanner class to perform the operations
        System.out.print("Enter Two Numbers: ");

        double first = reader.nextDouble();
        double second =reader.nextDouble();
        System.out.print("Enter Operation (+ , -, *, /): ");
        char operator = reader.next().charAt(0);
        double result = ' ';
        // By using the Switch case
        switch(operator){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default :
                System.out.printf("OOps looks like you have entered wrong keyword !!");
        }
     System.out.print("The Output is :" + result);


    }
}
