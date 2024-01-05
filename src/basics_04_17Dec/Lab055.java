package src.basics_04_17Dec;

import java.util.Scanner;
public class Lab055 {
    public static void main(String[] args) {

        //Triangle classifier:
        // Write a program that classifies a triangle based on its side length.
        // Given three input values representing the lengths of the sides, Determine
        // if the triangle is equilateral (all sides are equal).
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // use an if-else statement to classify the triangle.

        //side1, side2, side3 --> side1 = side2 = side3 --> equilateral
        //(side1 = side2) or side 2 == side 3 --> isosceles
        //scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1, side2, side3, I will tell about the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1 == side2)  && (side2 == side3) && (side1 == side3)){
            System.out.println("Equilateral");
        } else if ((side1 == side2)  || (side1 == side3) || (side2 == side3)){
            System.out.println("Isosceles");
        }else {
            System.out.println("Scalene");

        }
    }
}
