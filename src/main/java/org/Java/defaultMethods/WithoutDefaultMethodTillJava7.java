package main.java.org.Java.defaultMethods;

//access Modifier + static/default +return type +methodName(get/set)
//Interface methods are always public abstract, there is no need of access modifier or there is omitted(to leave or leave unmentioned)
//

interface Car{
    void getModelNumber();
     default void brake(){
         System.out.println("Brake is calling");
     };
}
//Concrete Implementation of abstract method of interface
class Kia implements Car{
    @Override
    public void getModelNumber(){
        System.out.println("UP6425789");
    }
}

public class WithoutDefaultMethodTillJava7 {
    public static void main(String[] args){
        Car obj1 = new Kia();
        obj1.getModelNumber();
        obj1.brake();

    }
}
