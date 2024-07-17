package main.java.org.corejava.collection.Map.HashMap;

import java.util.HashMap;

public class HashMapEx1 {
//PointsToRememberImplementation

        public static void main(String[] args)
        {
            HashMap<String, Integer> emp= new HashMap<String, Integer>();
            emp.put("Rajesh", 104669);
            emp.put("Vijay", 104668);
            emp.put("Prakhar ", 104662);
            //supports only one Null Key and multiple Null Values
            emp.put("Yogi",null);
            emp.put("Pawan",null);
            System.out.println("Size of HashMap is : "+ emp.size());

            if(emp.containsKey("Vijay"))
            {
                Integer a= emp.get("Vijay");
                System.out.println("Value of Vijay is  "+ a);
            //type sout and then press tab, automatically add System.out.println()
            System.out.println("Name of the Employee:"+ emp);
            // Java HashMap is non synchronized
        }

    }

}
