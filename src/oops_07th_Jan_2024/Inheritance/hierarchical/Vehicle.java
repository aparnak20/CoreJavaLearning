package src.oops_07th_Jan_2024.Inheritance.hierarchical;

public class Vehicle {
    Vehicle(){
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed(){
        System.out.println("Yeah from "+getClass().getSimpleName());
    }
}
