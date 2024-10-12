import java.util.Scanner;
import java.util.Arrays;

class DynamicArray {
    // Array to store elements and a variable to keep track of the size
    int[] arr;
    int size;

    // Constructor to initialize the dynamic array with an initial capacity of 2
    public DynamicArray() {
        arr = new int[2];  // Initial capacity
        size = 0;          // Initially, the size is zero
    }

    // Insertion method to add an element, resizes the array if full
    public void insert(int element) {
        if (size == arr.length) {
            resizeArray();  // Double the array size if capacity is full
        }
        arr[size] = element;  // Insert the element and increase the size
        size++;
    }

    // Resizing the array when capacity is full
    public void resizeArray() {
        int newSize = arr.length * 2;  // Double the current size
        arr = Arrays.copyOf(arr, newSize);  // Copy the old elements to the new array
    }

    // Deletion method to remove the first occurrence of the element
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
            size--;  // Reduce the size of the array
        } else {
            System.out.println("Element not found");
        }
    }

    // Traversal method to print all elements in the array
    public void traverse() {
        if (size == 0) {
            System.out.println("Array is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a dynamic array
        DynamicArray dynamicArray = new DynamicArray();

        // Menu-driven program to perform insert, delete, and traverse operations
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Traverse");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Insert element
                    System.out.print("Enter element to insert: ");
                    int element = scanner.nextInt();
                    dynamicArray.insert(element);
                    break;

                case 2:
                    // Delete element
                    System.out.print("Enter element to delete: ");
                    int delElement = scanner.nextInt();
                    dynamicArray.delete(delElement);
                    break;

                case 3:
                    // Traverse array
                    dynamicArray.traverse();
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

