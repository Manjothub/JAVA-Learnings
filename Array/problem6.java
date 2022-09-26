// Java program to remove a specific element from an array
import java.util.Arrays; 
public class problem6 {
 
public static void main(String[] args) {
   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  // Remove the second element (index->1, value->14) of the array
   int removeIndex = 1;

   for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
    System.out.println("After removing the second element: "+Arrays.toString(my_array));
 }
 }

