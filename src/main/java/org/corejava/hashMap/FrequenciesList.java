package main.java.org.corejava.hashMap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class FrequenciesList {
    public static void main(String[] args){
        List<String> listFruit = Arrays.asList("Apple", "banana", "Apple");


        // f-> f  Key mapper functions is used for collect the element from the stream and returns the same element in map
        // f -> 1L value function used for adding constant value for long objects
        // long :: sum is method reference in java  8


        Map<String,Long> frequencies = listFruit.stream()
                .collect(Collectors.toMap(f -> f, f -> 1L,Long ::sum)

                );
        System.out.println(frequencies);
    }
}
