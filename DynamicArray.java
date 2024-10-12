//A dynamic array resizes itself when more space is needed. It starts with an initial capacity, and when the size exceeds the capacity, the array is resized (typically doubled in size).

import java.util.Arrays;

public class DynamicArray {
    private int[] arr;  // Underlying array
    private int size;   // Current number of elements

    // Constructor to initialize the dynamic array with a small initial capacity
    public DynamicArray() {
        arr = new int[2];  // Initial capacity of 2
        size = 0;
    }

    // Method to insert an element at the end of the array
    public void insert(int element) {
        if (size == arr.length) {
            resizeArray();  // Double the size of the array if it's full
        }
        arr[size++] = element;
    }

    // Method to resize the array when it's full
    private void resizeArray() {
        int newSize = arr.length * 2;  // Double the size of the array
        arr = Arrays.copyOf(arr, newSize);  // Copy the elements to a new array of larger size
    }

    // Method to delete the first occurrence of an element in the array
    public void delete(int element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        } else {
            System.out.println("Element not found.");
        }
    }

    // Method to traverse and print all elements of the array
    public void traverse() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
