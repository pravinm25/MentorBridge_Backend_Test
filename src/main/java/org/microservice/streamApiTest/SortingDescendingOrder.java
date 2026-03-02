package org.microservice.streamApiTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingDescendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> descendingOrder = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending Order :"+descendingOrder);
    }
}
