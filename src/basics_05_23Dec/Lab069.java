package src.basics_05_23Dec;
import java.util.Scanner;
public class Lab069 {
    public static void main(String[] args) {

        //take user input and print the information

        Scanner user_input = new Scanner (System.in);
        System.out.println("enter your name");
        String name = user_input.next();

        System.out.println("Enter your age");
        int age = user_input.nextInt();

        System.out.println("Enter your salary");
        double salary = user_input.nextDouble();

        System.out.println("Your details are" + " - " + name + " - " + age + " - " + salary);

        user_input.close();

    }
}
