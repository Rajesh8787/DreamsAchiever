package main.java.org.corejava.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args){
        //created New empty Hashmap
        Map<String, Integer> empDetails = new HashMap<>();

        //storing a key value pairs by using put method
        empDetails.put("Rajesh", 23);
        empDetails.put("Prakhar",34);
        System.out.println(empDetails);

        //Retrieve value by key

        System.out.println("The value of Rajesh is "+ empDetails.get("Rajesh"));
        System.out.println("The value of Prakhar is "+ empDetails.get("Prakhar"));

        //check if or not
        System.out.println("Rajesh is present :"+ empDetails.containsKey("Rajesh"));

        //Remove key value pair
        empDetails.remove("Rajesh");
        System.out.println(empDetails.containsKey("Rajesh"));
    }
}
