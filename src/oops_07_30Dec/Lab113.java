package src.oops_07_30Dec;

public class Lab113 {
    public static void main(String[] args) {
        // what a function
        //Function can do some task

        //How to create a Function?
        //1.Defination
        //2.Call the Function

        //Function vs Method(is different OOPs)

        sayHello4Times(); //Call the function
        sayHello4Times();
//        double d = Math.pow(2,3);
//        System.out.println(d);


    }
//    accessModifire returnType methodName(parameterList){
//        // method body
//    }

    static void sayHello4Times(){ // Defination
        for(int i = 0; i < 4; i++){
            System.out.println("Hello");
        }

    }
}
