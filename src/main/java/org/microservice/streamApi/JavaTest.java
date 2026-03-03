package org.microservice.streamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaTest {
    public static void main(String[] args) {

        // Second Highest Number in the list
        List<Integer> numbers = Arrays.asList(10, 45, 67, 23, 89, 54, 89);
        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second Highest Number is: "+secondHighest);

        // First Non Repeating number in the list
        List<Integer> duplicates = Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2);
        Integer firstNonRepeating = duplicates.stream()
                .filter(n->duplicates.stream()
                        .filter(num->num.equals(n))
                        .count()==1).findFirst().orElse(null);
        System.out.println("First Non Repeating number: "+firstNonRepeating);

        // Find duplicate numbers in the list
        List<Integer> numberList = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
        Set<Integer> duplicateNumbers = new HashSet<>();
        List<Integer> duplicate = numberList.stream()
                .filter(n->!duplicateNumbers.add(n))
                .distinct().sorted().toList();
        System.out.println("Duplicate Numbers: "+duplicate);

        // Frequency of each number
        List<Integer> numberList1 = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 1);
        Map<Integer,Long> frequency = numberList1.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Numbers and its frequency: "+frequency);

        // Top 3 Highest Numbers
        List<Integer> numberList2 = Arrays.asList(10, 80, 45, 60, 30, 90, 20);
        List<Integer> highestThreeNumbers = numberList2.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println("Highest top 3 numbers :"+highestThreeNumbers);

        //Finding Even and odd numbers
        List<Integer> oddAndEven = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<Integer> evenNumbers = oddAndEven.stream()
                .filter(n->n%2==0)
                .toList();
        List<Integer> oddNumbers = oddAndEven.stream()
                .filter(n->n%2!=0)
                .toList();
        System.out.println("Even Numbers: "+evenNumbers);
        System.out.println("Odd Numbers: "+oddNumbers);

        //Numbers starting with "1"
        List<Integer> numberList3 = Arrays.asList(10, 15, 23, 11, 45, 19, 30);
        List<Integer> numStartWithOne = numberList3.stream()
                .filter(n-> String.valueOf(n).startsWith("1"))
                .toList();
        System.out.println("Numbers Starting with '1': "+numStartWithOne);

        // Common numbers between two lists
        List<Integer> listOne = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> listTwo = Arrays.asList(30, 40, 60, 70);
        List<Integer> commonNumbers = listOne.stream()
                .filter(listTwo::contains)
                .toList();
        System.out.println("Common numbers between two lists :"+commonNumbers);

        // Grouping numbers into even and odd
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25, 30);
        Map<String, List<Integer>> groupingNumbers = list.stream()
                .collect(Collectors.groupingBy(n->(n%2==0) ? "Even":"Odd"));
        System.out.println("Grouped even and odd numbers :"+groupingNumbers);

        // Sum of squares of even numbers
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer sum = list1.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .reduce(0,Integer::sum);
        System.out.println("Sum of squares of even numbers: "+sum);
    }
}
