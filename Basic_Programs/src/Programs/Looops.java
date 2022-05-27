package Programs;

public class Looops {
    public static void main(String[] args){
        // Java While Loop
//        int i = 0;
//        while (i <= 5) { // condition starts here
//            System.out.println(i);  // the output which you want to print after the condition runs everytime
//            i++; // here is the increement of the i
//        }
//
//        int num = 100;
//        while (num > 0) {
//            System.out.println(num);
//            num--;
//        }

        // Java Do while Loop
//        int a = 0;
//        do {
//            System.out.println(a);
//            a++;
//        }
//        while (a < 5);

        // Java for loop

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
// Java for each loop
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String i : cars) {
//            System.out.println(i);
//        }
        //Java break and continue
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                System.out.println("You have reached the checkpoint");
                break;
            }
        }
    }
}

