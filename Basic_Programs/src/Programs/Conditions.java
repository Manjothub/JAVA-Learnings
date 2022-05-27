package Programs;

public class Conditions {
    public static void main(String[] args){
        int x= 20;
        int y=60;
        if (x >y){
            System.out.println(x + " is Greater ");
        }
        else {
            System.out.println(y + " is Greater");
        }

//===================================================================

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }


//========================================================================
        // Java Short Hand if else (ternary operator)
        int watch = 20;
        String r = (watch < 18) ? "Good Morning ": "Good Evening";
        System.out.println(r);
    }



}
