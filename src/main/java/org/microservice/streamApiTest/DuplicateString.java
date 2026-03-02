package org.microservice.streamApiTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> count = letters.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("String and its Ocurrences: "+count);
        count.forEach((key,value)->{
            if(value>1){
                System.out.println("Duplicate string "+key+" and its count "+value);
            }
        });
    }
}
