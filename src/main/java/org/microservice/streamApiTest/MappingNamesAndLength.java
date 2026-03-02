package org.microservice.streamApiTest;

import java.util.Arrays;
import java.util.List;

public class MappingNamesAndLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        List<Integer> length = names.stream().map(String::length).toList();
        System.out.println(length);
    }
}
