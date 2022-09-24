// Sort a Numeric Array and a String Array
import java.util.Arrays;
public class problem1{
    public static void main(String[] args){
        int[] myarr = {10,30,55,40,60,50};
        String[] myarr2 ={"Java","Python","C++"};
        System.out.println("Original Numeric Array:" +Arrays.toString(myarr));
        Arrays.sort(myarr);
        System.out.println("Sorted Numeric Array:" +Arrays.toString(myarr));
        System.out.println("Original String Array:" +Arrays.toString(myarr2));
        Arrays.sort(myarr);
        System.out.println("Sorted String Array:" +Arrays.toString(myarr2));
    }

}