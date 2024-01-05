package src.basics_05_23Dec;

public class Lab082 {
    public static void main(String[] args) {

        // for(A; B; C)
        // A- Initialization - JVM what variable, where are you are starting point
        // B- Condition - when you want this to stop. --> true, false
        // C - Increment / Decrement


        // Print the odd number in between the 1 to 50
        // If Else

//
//            for (int i = 1; i <=50; i++){
//                if(i%2 ==0) //!(i%2==1) or (i%2==0)
//                {
//                    System.out.println(i + " is odd!");
//                }
//            }
//

//            for (int i = 50; i > 0; i--) -reverse
           for (int i = 0; i <= 50; i++){
            if(i%2 ==0) //!(i%2==1) or (i%2==0)
            {
                System.out.println(i + " is Even!");
            }
        }
        System.out.println("End of program!!");
    }
}
