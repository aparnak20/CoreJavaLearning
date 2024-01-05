package src.basics_03_16Dec;

public class Lab037 {
    public static void main(String[] args) {

        // Conditional ternary Operator
        // int a = condition ? if this is true print do this : If false do this.

        //MAX in two number?
        //a = 10
        //b = 20
        //a > b -> a,
        //b > a -> b

        int a = 10;
        int b = 20;
        int max = a < b ? b : a;
        int min = a < b ? a : b;
        System.out.println(max);
        System.out.println(min);
    }
}
