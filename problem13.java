// Java program to find the second largest element in an array
public class problem13 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        int index = arr.length-1;
        while(arr[index]==arr[arr.length-1]){
            index--;
        }
        System.out.println("Second largest value: " + arr[index]);
    }
}
