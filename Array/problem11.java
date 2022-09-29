// Java program to find the duplicate values of an array of integer values
public class problem11 {
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50,50,60,60};
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if((arr[i] == arr[j]) && (i !=j)){
                    System.out.println("Duplicate Elements are:"+arr[j]);
                }
            }
        }
    }
}
