// Average of the Array
public class problem3 {
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};
        int sum = 0;
        double average = 0;
        for(int i : arr){
            sum += i;
             average = sum/arr.length;
        } 
        System.out.println("Average is " +average);
    }
}
