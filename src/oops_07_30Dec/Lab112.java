package src.oops_07_30Dec;

public class Lab112 {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;
//        int c = a+b;
//        System.out.println(c);
//
//        a = 34;
//        b = 45;
//        int d = a + b;
//        System.out.println(d);
        int c = aparna_sum();           // No argument
        int c1 = aparna_sum(2);  // 1 arguments
        int c2 = aparna_sum(2,9);       // 1 arguments
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        sayHello(); // call to the function
    }

    static int aparna_sum(int input_1, int input_2) { // Definition of the function
        return input_1 + input_2;

    }
    static int aparna_sum ( int input_1) {
        return input_1;
    }


    static int aparna_sum (){
        return 99;

    }

    static int pramod_sum(int input_1, int input_2, int c) {
        return input_1 + input_2 + c;
    }

    static void sayHello(){
        System.out.println("Say Yes");
    }

    }


