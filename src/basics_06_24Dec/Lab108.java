package src.basics_06_24Dec;

public class Lab108 {
    public static void main(String[] args) {
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        //Coding
        //1.user input
        //2.Rough logic ->  (year%4 ==0) -> leap and (year%100 /=0) -> leap or year % 400 ==0
        //3.Brute force
        //4.Logic correction

        int year = 2021; // Replace with the year you want to check

        //boolean isLeapYear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            isLeapYear = true;
//        }
//        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
