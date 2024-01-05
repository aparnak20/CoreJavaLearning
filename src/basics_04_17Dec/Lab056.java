package src.basics_04_17Dec;
import java.util.Scanner;
public class Lab056 {
    public static void main(String[] args) {

        //If, Switch --> condition based
        //Loops --> which will repeat something - for, while, do while
        //Switch -->condition based - multiple condition
        //If else if else

        // which day is today!!

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day, I will tell which day it is");
        // 1--> Monday, 7--> Sunday invalid-->99 - are you mad?
        int dayNumber = sc.nextInt();

        String day = null;

        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ARE YOU MAD?");
                break;//this break is optional if default is last option.
        }
        System.out.println("--End of Program--");

    }
}
