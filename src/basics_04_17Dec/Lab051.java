package src.basics_04_17Dec;
import java.util.Scanner;
public class Lab051 {
    public static void main(String[] args) {

        //Grade Calculator
        //Write a program that calculates and displays the letter grade for a given
        //numerical score (e.g. A, B, C, D or F) based on the following
        //grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        // 1. Input from user
        // Score(Data type) --> int --> Grade(char or string)

        // 2. Basic login or brute force logic write basic rough code
        // If score >= 90 && score <=100 --> print A
        // else if score >= 89 <= 100 --> Print B

        // 3. Write the real code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student Score");
        int score = sc.nextInt();

//        char grade = 'F';
//        char grade = '0'; or
//
//        if (score >= 90 && score <= 100){
//        grade = 'A';
//        System.out.println("Your score" + grade);
//        }

        if (score >= 90 && score <= 100) {
            System.out.println("Your score --> A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your score --> B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your score --> C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your score --> D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Your score --> F");
        }



        // 4. Debug the code
        // we are debug and checking the code. -->
        // Other than int --> code fails - we are fix Exceptions - in future.
        // this program does not run again and again.
        // 5. Fix the code and final it


    }
}
