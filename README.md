# Java Array Utilities

This repository contains Java programs designed to demonstrate various array operations, including sorting numbers into even and odd categories, finding two neighboring numbers in an array with the smallest distance, and converting between arrays and `ArrayLists`.

## Contents

- **EvenOddSorter**: A class that sorts numbers into even and odd categories based on user input.
- **NeighboringNumbersFinder**: A function that finds two neighboring numbers in an array with the smallest distance to each other and returns the index of the first number.
- **ArrayArrayListConverter**: A Java program that demonstrates converting an array into an `ArrayList` and vice versa.

## Getting Started

To run these programs, you will need a Java Development Kit (JDK) installed on your system. These programs were written using Java 8, but they should be compatible with most JDK versions.

### Prerequisites

- Java Development Kit (JDK) 8 or later

- # Java Array Utilities

This repository contains Java programs designed to demonstrate various array operations, including sorting numbers into even and odd categories, finding two neighboring numbers in an array with the smallest distance, and converting between arrays and `ArrayLists`.


# Methodologies of each class

### EvenOddSorter Methodology

This program uses a simple modulus operation to categorize numbers into even and odd. Users input numbers sequentially, and for each number, the program checks if it is divisible by 2 (using `number % 2 == 0`). If true, the number is classified as even; otherwise, it's classified as odd. This classification uses dynamic arrays (`ArrayList`) to store even and odd numbers without needing to predefine the array size.

### NeighboringNumbersFinder Methodology

The `findNeighboringNumbers` function iterates through the given array to find the pair of neighboring numbers with the smallest distance between them. It starts by initializing a variable to store the minimum distance found and iterates through the array, comparing each pair of neighbors. The function keeps track of the index of the first number in the pair with the smallest distance found so far. This approach ensures that the entire array is scanned, and the indices of the numbers with the smallest distance are accurately identified.

### ArrayArrayListConverter Methodology

The conversion between an array and an `ArrayList` is facilitated by Java's Collections Framework. To convert an array to an `ArrayList`, the program utilizes `Arrays.asList(array)` method, which returns a fixed-size list backed by the specified array. Conversely, to convert an `ArrayList` to an array, the program uses the `ArrayList.toArray()` method, which returns an array containing all the elements in the `ArrayList` in the correct order.

