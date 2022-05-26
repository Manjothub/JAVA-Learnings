package Programs;

public class Typecasting {
    public static void main(String[] args){
        // we are doing the widening casting which we can call ascending order like byte--short--int--float--long--double
        int myNum = 54;
        float val = 3.189f;
        System.out.println("This is the integer value: "+ myNum);
        System.out.println("This is the floating value: "+ val);

        // we are now doing Narrowing Casting which we can call the descending values like double--long--float--int--short--byte
        int age = 3;
        double height = age;
        System.out.println("This is the int to double value" + height);

        double m = 3.147;
        System.out.println((int)m);
    }
}
