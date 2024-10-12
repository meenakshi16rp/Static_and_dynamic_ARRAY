public class StaticArray {
    private int[] arr;      // Underlying array
    private int size;       // Current number of elements
    private int capacity;   // Maximum capacity of the array

    // Constructor to initialize the array with a fixed size
    public StaticArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    // Method to insert an element at the end of the array
    public void insert(int element) {
        if (size < capacity) {
            arr[size++] = element; // Insert the element and increase the size
        } else {
            System.out.println("Array is full. Cannot insert more elements.");
        }
    }

    // Method to delete the first occurrence of an element in the array
    public void delete(int element) {
        int index = -1;
        // Find the index of the element to be deleted
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        // If the element is found, shift the remaining elements to fill the gap
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


   
