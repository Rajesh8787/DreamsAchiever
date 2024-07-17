package main.java.org.corejava.hashMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// You have a given a task to convert Integer list to String list

public class IntegertoStringInList {
    public static void main(String[] arg){
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        List<Integer> conList = numList.stream()
                .map(x -> x*x)
                .collect(Collectors.toList());

        System.out.println(conList);
    }
}
