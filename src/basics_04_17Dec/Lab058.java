package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character, I will tell if it is vowel ");

        // a e i o u -

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch(user_input){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("not a vowel, It is Constant");
        }

    }
}
