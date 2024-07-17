package main.java.org.Java;

// whenever there is a abstract method, it must be define in implementation class
//due to this drawback, default methods came to deal this issue
//

interface Human{
    int haveLegs();
     default String getName(){
         return " Abc is a Name";
     }
}

//implementation class
class PersonImp implements Human{
    @Override
    public int haveLegs(){
        return 2;
    }
}


//main class
public class Person {
    public static void main(String args[]){
        Human per1 = new PersonImp();
        System.out.println(per1.haveLegs());
        System.out.println(per1.getName());

    }
}
