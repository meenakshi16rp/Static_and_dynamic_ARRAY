// File: StringOperations.java
public class StringOperations {
    
    // Method to concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Method to get a substring from a string
    public String substring(String str, int start, int end) {
        if (start >= 0 && end <= str.length() && start < end) {
            return str.substring(start, end);
        }
        return "Invalid range";
    }

    // Method to compare two strings for equality
    public boolean compare(String str1, String str2) {
        return str1.equals(str2);
    }
}
