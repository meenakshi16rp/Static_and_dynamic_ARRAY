import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    // Method to calculate the frequency of each character in a string
    public Map<Character, Integer> calculateFrequency(String str) {
        // Creating a HashMap to store character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();

        // Convert the input string to lowercase to make the frequency count case-insensitive
        str = str.toLowerCase();

        // Loop through each character of the string
        for (char c : str.toCharArray()) {
            // Only consider alphanumeric characters (letters and digits)
            if (Character.isLetterOrDigit(c)) {
                // If the character is already in the map, increment its frequency by 1.
                // If it's not, add it to the map with an initial frequency of 1.
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }
        // Return the map containing the frequency count for each character
        return freqMap;
    }

    // Method to format the output in Python-like dictionary form
    public String formatAsPythonDict(Map<Character, Integer> freqMap) {
        // StringBuilder is used for efficient string concatenation
        StringBuilder result = new StringBuilder("{");

        // Loop through the map to append each key-value pair in 'key': value format
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            result.append("'").append(entry.getKey()).append("': ").append(entry.getValue()).append(", ");
        }

        // Remove the last comma and space for correct formatting
        if (result.length() > 1) {
            result.setLength(result.length() - 2);
        }

        // Close the dictionary with a closing curly brace
        result.append("}");
        
        // Return the formatted string
        return result.toString();
    }
}

