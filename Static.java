import java.util.Scanner; // Scanner class is used for interactive input
class StaticArray {
    int[] arr; //declare an array
    int size; //size tracks the number of elements.
    int capacity; //capacity is the maximum size

    public StaticArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        arr = new int[capacity]; //initialize an array
    }

    // Insertion of element at the next available index
    public void insert(int element) {
        if (size < capacity) {
            arr[size] = element;//Add the element and increment the size
            size++;
        } else {
            System.out.println("Array is full");
        }
    }

    // Deletion method to remove the first occurrence of an element
    public void delete(int element) {
        int index = -1; // Find the index of the element to delete
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        // If the element is found, shift elements left to fill the gap
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--; // Decrease the size of the array
        } else {
            System.out.println("Element not found");
        }
    }

    // Traversal method to display the elements of array
    public void traverse() {
        if (size == 0) {
            System.out.println("Array is empty");
        } else {
            // Print all elements in the array
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input for array capacity
        System.out.print("Enter the capacity of the array: ");
        int capacity = scanner.nextInt();

        // Creating a static array
        StaticArray staticArray = new StaticArray(capacity);

        // Menu-driven program to perform insert, delete, and traverse
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Traverse");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                // Insert element
                case 1:
                    System.out.print("Enter element to insert: ");
                    int element = scanner.nextInt();
                    staticArray.insert(element);
                    break;

                case 2:
                    // Delete element
                    System.out.print("Enter element to delete: ");
                    int delElement = scanner.nextInt();
                    staticArray.delete(delElement);
                    break;
                case 3:
                    // Traverse array
                    System.out.println("Traversing array:");
                    staticArray.traverse();
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
