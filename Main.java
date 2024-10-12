public class Main {
    public static void main(String[] args) {
        System.out.println("Static Array:");
        StaticArray staticArray = new StaticArray(5);  // Static array with fixed size of 5
        staticArray.insert(1);
        staticArray.insert(2);
        staticArray.delete(1);
        staticArray.traverse();  // Output: 2

        System.out.println("\nDynamic Array:");
        DynamicArray dynamicArray = new DynamicArray();  // Dynamic array starts with a small capacity
        dynamicArray.insert(1);
        dynamicArray.insert(2);
        dynamicArray.delete(1);
        dynamicArray.traverse();  // Output: 2

        // Testing String Operations
        StringOperations strOps = new StringOperations();
        
        // Concatenation
        String resultConcat = strOps.concatenate("Hello", "World");
        System.out.println("Concatenation: " + resultConcat);  // Output: HelloWorld
        
        // Substring
        String resultSubstr = strOps.substring("HelloWorld", 3, 5);
        System.out.println("Substring: " + resultSubstr);  // Output: lo
        
        // Comparison
        boolean resultCompare = strOps.compare("Hello", "World");
        System.out.println("Comparison: " + resultCompare);  // Output: false

        // Testing Character Frequency
        CharacterFrequency charFreq = new CharacterFrequency();
        System.out.println("Character Frequency for 'Hello':");
        charFreq.calculateFrequency("Hello");
        // Output: 
        // H: 1
        // e: 1
        // l: 2
        // o: 1
    }
}



      
    }
}
