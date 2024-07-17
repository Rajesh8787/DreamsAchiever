package main.java.org.Java;


import org.w3c.dom.ls.LSOutput;

interface ABC{
    //declaring variable  in interface considered as by defalut Final

    int A = 9;
    default void show(){
        System.out.println(" interface a");
    }
}
class DemoImp2 implements ABC{
    public void abc(){
        //got error because it is final so cant change A
    //    A =10;
    }

}
public class VariableBydefault {
    ABC obj = new DemoImp2();


}
