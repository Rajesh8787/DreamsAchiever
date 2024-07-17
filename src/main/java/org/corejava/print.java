//https://javarevisited.blogspot.com/2023/10/15-example-of-print-and-println-methods.html#more

//Q: Printing string without using System.out.println but use print and println

//Using PrintStream class
package main.java.org.corejava;
import  java.io.*;

public class print {
    public static void main(String[] args)
    {
        PrintStream ps= new PrintStream(System.out);  //new object creating
        ps.println("Hi I m using println");
        ps.print("this  is true");
        //System.out.println("hello Rajesh");
    }
}
