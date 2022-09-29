// Java program to find the duplicate values of an array of string values
public class problem12 {
    public static void main(String[] args){
        String[] arr = {"abc","abc","bcd","cdf","abc","bcd"};
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if( (arr[i].equals(arr[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+arr[j]);
                }
            }
        }
    }
}
