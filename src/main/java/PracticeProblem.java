public class PracticeProblem {
    public static void main(String[] args) {
	
        // Test the methods
        int[] numbers = {10, 20, 30};
        
        System.out.println(validIndex(numbers, 1)); // true (index 1 exists)
        System.out.println(validIndex(numbers, 5)); // false (index 5 doesn't exist)
        
        System.out.println(divide(10, 2)); // 5
        System.out.println(divide(10, 0)); // 0 (division by zero)
        
        System.out.println(safeConvertStringtoInt("123")); // 123
        System.out.println(safeConvertStringtoInt("hello")); // 0 (can't convert)
    }
    
    // Check if index is valid in array
    public static boolean validIndex(int[] array, int index) {
        try {
            int test = array[index]; // Try to access the index
            return true; // If no exception, index is valid
        } catch (Exception e) {
            return false; // If exception, index is invalid
        }
    }
    
    // Safe division
    public static int divide(int a, int b) {
        try {
            return a / b; // Try to divide
        } catch (Exception e) {
            return 0; // If division fails (like by zero), return 0
        }
    }
    
    // Safe string to integer conversion
    public static int safeConvertStringtoInt(String text) {
        try {
            return Integer.parseInt(text); // Try to convert
        } catch (Exception e) {
            return 0; // If conversion fails, return 0
        }
    }
}
	


