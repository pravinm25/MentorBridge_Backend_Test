package org.microservice.streamApiTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> duplicateOnes = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !duplicateOnes.add(n))
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}


