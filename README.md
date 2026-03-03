# Java 8 Stream API Practice Programs

This repository contains Java 8 Stream API practice programs that demonstrate common interview-based problems using functional programming concepts like filter, map, sorted, collect, groupingBy, counting, and distinct.

---

## Topics Covered

### 1️.Find Even Numbers Using Stream

**Input: 10,15,8,49,25,98,32**

**Description:**  
Filters all even numbers from the list using filter() and collects them into a new list.

---

### 2️.Find Duplicate Elements in Integer List

**Input: 10,15,8,49,25,98,98,32,15**


**Description:**  
Uses filter() along with a HashSet to identify duplicate elements in the list.The add() method of Set returns false if the element already exists, and those elements are filtered as duplicates.Finally, the duplicates are collected into a Set using collect(Collectors.toSet()).

---

### 3️.Sort List in Descending Order

**Input: 10,15,8,49,25,98,98,32,15**


**Description:**  
Sorts elements in descending order using sorted(Comparator.reverseOrder()).

---

### 4️.Find Duplicate Strings with Count

**Input: [“AA", "BB", "AA", "CC”]**


**Description:**  
Uses Collectors.groupingBy() along with Collectors.counting() to count the occurrences of each string in the list. The result is stored in a Map<String, Long> where the key is the string and the value is its count. Then, forEach() is used to print only those strings whose count is greater than 1, identifying duplicate strings along with their occurrences.

---

### 5️.Mapping Names to Length

**Input: ["John", "Alice", "Bob"]**


**Description:**  
Uses map() function to transform each name into its length and collects results into a list.

---

### 6️.Remove Duplicates (Distinct Elements)

**Input: [1, 2, 2, 3, 4, 4, 4, 5]**


**Description:**  
Uses distinct() method to remove duplicate elements from the list.

---

## Technologies Used

- Java 8  
- Stream API  
- Collections Framework  

---

## Purpose

This project is created for:

- Java 8 Stream API practice  
- Interview preparation  
- Understanding functional programming concepts in Java  
- Improving problem-solving skills  

---

## How to Run

1. Clone the repository  
2. Open in IntelliJ / Eclipse  
3. Run the main class file  

---

## Concepts Used

- filter()  
- map() 
- sorted() 
- distinct()  
- collect()  
- groupingBy()  
- counting()  
- Comparator.reverseOrder()  
