package org.microservice.streamApiTest;

import java.util.Arrays;
import java.util.List;

public class FindingDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        numbers.stream().distinct().forEach(System.out::println);
    }
}

