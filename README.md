# Backend Test Questions - Stream API Practice

This repository contains Java 8 Stream API practice programs implemented for backend skill development and interview preparation.

## About This Project

This project demonstrates various common coding problems solved using:

- Java 8 Stream API
- Lambda Expressions
- Collections Framework
- Functional Programming Concepts


---

## Implemented Programs

- Second Highest Number in a List  
- First Non-Repeating Number  
- Find Duplicate Numbers  
- Frequency of Each Number  
- Top 3 Highest Numbers  
- Even and Odd Number Separation  
- Numbers Starting With Specific Digit  
- Common Elements Between Two Lists  
- Group Numbers by Even and Odd  
- Sum of Squares of Even Numbers  

---

## Technologies Used

- Java 8
- Stream API
- Collections
- IntelliJ IDEA

---

## How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA / Eclipse
3. Navigate to:
   src/main/java/org/microservice/streamApi/JavaTest.java
4. Run the main method

---


## Program Descriptions

### 1️.Second Highest Number
This program finds the second largest number from a list.
It removes duplicates using distinct(), sorts the numbers in descending order using sorted(Comparator.reverseOrder()), skips the first element using skip(1), and retrieves the next element using findFirst().

---

### 2️.First Non-Repeating Number
This program identifies the first number that appears only once in the list.
It filters elements whose count is equal to 1 and returns the first such element.

---

### 3️.Find Duplicate Numbers
This program finds duplicate numbers in a list.
It uses a HashSet to track already seen elements and filters elements that cannot be added again to the set.

---

### 4️.Frequency of Each Number
This program calculates how many times each number appears in the list.
It uses Collectors.groupingBy() along with Collectors.counting() to store results in a Map.

---

### 5️.Top 3 Highest Numbers
This program retrieves the top three highest numbers from a list.
It sorts the list in descending order and limits the result to 3 elements using limit(3).

---

### 6️.Even and Odd Numbers
This program separates numbers into even and odd lists.
It uses the modulus operator (n % 2) inside filter() to classify numbers.

---

### 7️.Numbers Starting With "1"
This program filters numbers that start with digit "1".
It converts numbers to String format and checks using startsWith("1").

---

### 8️.Common Numbers Between Two Lists
This program finds common elements between two lists.
It filters elements from the first list that are present in the second list using contains().

---

### 9️.Grouping Numbers into Even and Odd
This program groups numbers into a Map with keys "Even" and "Odd".
It uses Collectors.groupingBy() to classify elements based on condition.

---

### 10.Sum of Squares of Even Numbers
This program calculates the sum of squares of even numbers.
It filters even numbers, squares each number using map(), and calculates total using reduce().

## Purpose

This project is created to improve problem-solving skills using Stream API and to strengthen backend Java fundamentals.

---

