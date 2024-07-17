package main.java.org.corejava.oops.encapsulation;

class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
        }

     public void setAge(int age){
        this.age = age;
        }
}

public class EncapsulationPerson {
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Rajesh");
        p.setAge(23);

        System.out.println("Name: "+p.getName());
        System.out.println("Name: "+p.getAge());
        System.out.println("Encapsulation is Achieved");
    }
}
