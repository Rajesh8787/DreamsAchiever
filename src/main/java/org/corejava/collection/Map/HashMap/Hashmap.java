package main.java.org.corejava.collection.Map.HashMap;

import java.util.HashMap;

//PointsToRememberImplementation

public class Hashmap {
    public static void main(String[] args)
    {
        HashMap<String, Integer> emp= new HashMap<String, Integer>();
        emp.put("Rajesh", 104669);
        emp.put(" ", 104668);
        emp.put(" ", 104662);
        //supports only one Null Key and multiple Null Values
        emp.put(" hh",null);
        emp.put(" hd",null);

        //type sout and then press tab, automatically add System.out.println()
        System.out.println("Name of the Employee:"+ emp);
        // Java HashMap is non synchronized
    }

}
