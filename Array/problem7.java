import java.util.Arrays;

// Copy an array by iterating the array
public class problem7 {
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50,60};
        int [] arr2 = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        System.out.println("New Array: "+Arrays.toString(arr2));
    }
}
