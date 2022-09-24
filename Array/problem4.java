// Java program to test if an array contains a specific value
// conatins is used for the checking the value is present or not
public class problem4 {
    public static boolean contains(int[] arr, int item){
        for(int n:arr){
            if (item == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};
        System.out.println(contains(arr, 30));
    }
}
