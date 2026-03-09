package org.microservice.streamApiTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiTest {
    public static void main(String[] args) {
        // Find Second Highest Number
        List<Integer> list = Arrays.asList(10, 45, 67, 23, 89, 54, 89);
        Integer secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second highest number is : "+secondHighest);

        // Find First Non-Repeated Number
        List<Integer> numbers = Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2);
        Integer nonRepeatedNum = numbers.stream()
                .filter(n->numbers.stream()
                        .filter(num->num.equals(n))
                        .count()==1).findFirst().orElse(null);
        System.out.println("First Non repeating number is :"+nonRepeatedNum);

        // Find Duplicate Numbers
        List<Integer> numberList = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
        List<Integer> duplicates = numberList.stream()
                .filter(n->numberList.stream()
                        .filter(num->num.equals(n))
                        .count()>=2).distinct().toList();
        System.out.println("Duplicate Numbers : "+duplicates);

        // Count Frequency of Each Number
        List<Integer> list1 = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 1);
        Map<Integer,Long> frequency = list1.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));
        //System.out.println(frequency);
        frequency.forEach((key,value)-> System.out.println(key+" : "+value));

        // Find Top 3 Highest Numbers
        List<Integer> list2 = Arrays.asList(10, 80, 45, 60, 30, 90, 20);
        list2.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        // Partition Numbers into Even and Odd
        List<Integer> list3 = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<Integer> evenNumbers = list3.stream()
                .filter(n->n%2==0)
                .toList();
        List<Integer> oddNumbers = list3.stream()
                .filter(n->n%2!=0)
                .toList();
        System.out.println("Even Numbers :"+evenNumbers);
        System.out.println("Odd Numbers :"+oddNumbers);

        // Find Numbers Starting With Digit 1
        List<Integer> list4 = Arrays.asList(10, 15, 23, 11, 45, 19, 30);
        List<Integer> result = list4.stream()
                .filter(n-> String.valueOf(n).startsWith("1"))
                .toList();
        System.out.println("Numbers starts with 1: "+result);

        // Find Common Elements Between Two Lists
        List<Integer> listOne = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> listTwo = Arrays.asList(30, 40, 60, 70);
        List<Integer> commonNumbers = listOne.stream()
                .filter(listTwo::contains)
                .toList();
        System.out.println("Common Numbers :"+commonNumbers);

        // Group Numbers by Even and Odd
        List<Integer> list5 = Arrays.asList(5, 10, 15, 20, 25, 30);
        Map<String, List<Integer>> res = list5.stream()
                .collect(Collectors.groupingBy(n->(n%2==0)? "Even":"Odd"));
        System.out.println(res);

        // Find Sum of Squares of Even Numbers
        List<Integer> list6 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer answer = list6.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .reduce(0,Integer::sum);
        System.out.println("Sum of squares of even numbers : "+answer);
    }
}
