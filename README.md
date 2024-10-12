## Overview
This project contains four main Java classes:

1. StaticArray: Implements basic array operations such as insertion, deletion, and traversal for a fixed-size array.
2. DynamicArray: Implements dynamic array operations including insertion, deletion, and traversal, allowing the array to grow dynamically.
3. StringOperations: Implements basic string operations like concatenation, substring extraction, and string comparison.
4. CharacterFrequency: Counts and displays the frequency of each character in a given string in a Python-like dictionary format.

## Classes and Methods

StaticArray.java
--> insert(int index, int value): Inserts the given value at the specified index in the static array.
--> delete(int index): Deletes the value at the specified index in the static array.
--> traverse(): Traverses and prints the entire static array.


DynamicArray.java
--> insert(int value): Inserts the given value at the end of the dynamic array. If the array reaches its capacity, it resizes to accommodate new elements.
--> delete(int index): Deletes the value at the specified index and shifts the remaining elements.
--> traverse(): Traverses and prints the entire dynamic array.


StringOperations.java
--> concatenate(String str1, String str2): Concatenates str1 and str2.
--> substring(String str, int start, int end): Returns the substring of str from index start to end.
--> compare(String str1, String str2): Compares str1 and str2 for equality.


CharacterFrequency.java
--> calculateFrequency(String str): Calculates the frequency of each character in the given string (in lowercase) and returns the result as a dictionary-like format.
--> formatAsPythonDict(Map<Character, Integer> freqMap): Formats the character frequency count into a Python-like dictionary format for easier reading.


## Running the Program

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile the Java files using the following command:
   javac StaticArray.java DynamicArray.java StringOperations.java CharacterFrequency.java 
   Main.java
4. Run the main program
   java Main
