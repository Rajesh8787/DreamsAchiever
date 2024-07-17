package main.java.org.Java.defaultMethods;

interface CarDemo{

    //creating a abstract method with there is no body
    // access modifier+ static/default/abstract + data type +method name
    void getModel();
}
//since in Java, Interface is implicitly Public, there is no need declaring concrete class public
class Tata implements CarDemo {
    @Override
    public void getModel() {
        {
            System.out.println("UP64 8787");
        }
    }
}

    class PracticeCar {
        public static void main(String[] args) {
            CarDemo obj1 = new Tata();
            obj1.getModel();
        }
    }

