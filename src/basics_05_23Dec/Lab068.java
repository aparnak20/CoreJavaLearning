package src.basics_05_23Dec;

import java.util.Scanner;
public class Lab068 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x");
        double x = sc.nextDouble();
        System.out.println("Enter the y");
        double y = sc.nextDouble();
        System.out.println("Enter the z");
        double z = sc.nextDouble();

        double result = 0;

        // 3/x^2 + y^2 - |z|
        // A+B-C--> A--> x^2, B--> y^2, C -->|z| abs(z) |-1\-->1
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);

        //scanner stream should be closed after we are done.
        //jvm will do it, garbage collector -->who will do it for you
        sc.close();


    }
}
