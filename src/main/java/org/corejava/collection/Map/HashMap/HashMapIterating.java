package main.java.org.corejava.collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterating {
    public static void main(String[] args) {
        HashMap<String, Integer> emp = new HashMap<String, Integer>();
        emp.put("Rajesh", 104669);
        emp.put("Vijay", 104668);
        emp.put("Prakhar ", 104662);
        //supports only one Null Key and multiple Null Values
        emp.put("Yogi", null);
        emp.put("Pawan", null);
        //Iterating using for loop

        for (Map.Entry m : emp.entrySet())
        {
            System.out.println(m.getKey()+" " + m.getValue());
        }
    }
}
