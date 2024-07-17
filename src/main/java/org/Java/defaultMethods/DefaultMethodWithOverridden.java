package main.java.org.Java.defaultMethods;


import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

interface Demo{
    default void show(){
        System.out.println("Default method is calling");
    }

    //Static as you know, no need to creating an object,it can be accessible for all

    static void display(){
        System.out.println("static method is calling");
    }

}

class ImpDemo implements Demo{
    //@Override
    public void show(){
        System.out.println("over ride is calling");
    }
}
public class DefaultMethodWithOverridden {
    public static void main(String[] args){
        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }


        for(String arg: args){
            System.out.println("Argument are " + arg);

        }
        Demo obj1 =new ImpDemo();
        obj1.show();
        Demo.display();
    }
}
