package main.java.org.Java;
//way1 to ressolve multiple inheritance issue
//put



interface AB{
    void abc();
    default String show(){
        return "A interface is calling";
    }
}
interface CB{
    default String show(){
        return "A interface is calling";
    }
}
class DemoImp implements AB,CB{
    @Override
    public void abc(){
        System.out.println("DemoImp is called");
    }

    //way1 to ressolve multiple inheritance while using defalut keyword

    @Override
    public String show(){
       return " DemoImp";
    }
    }

public class MultipleInheritanceIssueWay1 {
    public static void main(String args[]){
        AB obj = new DemoImp();
        System.out.println(obj.show());
    }
}
