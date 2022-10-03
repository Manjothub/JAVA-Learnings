// Java program to find the second smallest element in an array
import java.util.Arrays;
public class problem14 {
  public static void main(String[] args) {
    int[] my_array = {100,200,5,99,101,70};
    System.out.println("Original numeric array : "+Arrays.toString(my_array));
    int min = Integer.MAX_VALUE;
    int second_min = Integer.MAX_VALUE;
    for (int i = 0; i < my_array.length; i++) {
        if(my_array[i]==min){
          second_min=min;
        } else if (my_array[i] < min) {
            second_min = min;
            min = my_array[i];
        } else if (my_array[i] < second_min) {
            second_min = my_array[i];
        }

    }
    System.out.println("Second lowest number is : " + second_min);
    }
}
