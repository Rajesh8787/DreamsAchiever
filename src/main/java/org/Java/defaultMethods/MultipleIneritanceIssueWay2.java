package main.java.org.Java;

interface A{
    void abc();
     default void show(){
         System.out.println("A interface");
     }
}

//interface 2
interface B{
    default void show()
    {
        System.out.println("B interface");
    }
}

//implementation class
class Imp implements A, B{
    @Override
    public void abc(){
        System.out.println(" imp class");

    }


    //use super class to call default method
    @Override
    public void show() {
        A.super.show();
    }
}

public class MultipleIneritanceIssueWay2 {
    public static void main(String args[]){
        A obj = new Imp();
        obj.show();
    }
}
