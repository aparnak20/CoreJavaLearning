package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

        //int a = 34;
        // Take an input from  user? Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell if it is even / odd");
        int a = sc.nextInt();


        if (a%2 == 1){
            System.out.println("ODD Number");
        }else{
            System.out.println("Even Number");
        }

        //a%2 == 1 -> Even Number
        //a%2 == 0 -> Odd Number
    }
}
