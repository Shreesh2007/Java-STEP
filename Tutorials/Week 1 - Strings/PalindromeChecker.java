import java.util.Scanner;
public class PalindromeChecker {

    // Method 1: Iterative Approach
    boolean isPalindromeIterative(String text) {
        int n = text.length();
        int left = 0;
        int right =  n-1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Method 2: Recursive Approach
    boolean isPalindromeRecursive(String text) {
        int n = text.length();
        return checkPalindrome(text, 0, n-1);
    }
    
    boolean checkPalindrome(String text, int left, int right) {
        if (left >= right) return true;
        if (text.charAt(left) != text.charAt(right)) return false;
        return checkPalindrome(text, left + 1, right - 1);
    }

    // Method 3: Array Reversal Approach
    boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = text.toCharArray();
        int r = reversed.length;
        int o = original.length;
        int start = 0;
        int end = r-1;

        while (start < end) {
            char temp = reversed[start];
            reversed[start] = reversed[end];
            reversed[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i<o; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        PalindromeChecker obj = new PalindromeChecker();

        // Taking User Input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        boolean iterative = obj.isPalindromeIterative(text);
        boolean recursive = obj.isPalindromeRecursive(text);
        boolean arrayReversal = obj.isPalindromeArrayReversal(text);

        // Displaying Results
        System.out.println("\nResults:");
        System.out.println("Iterative: " + (iterative ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive: " + (recursive ? "Palindrome" : "Not Palindrome"));
        System.out.println("Array Reversal: " + (arrayReversal ? "Palindrome" : "Not Palindrome"));
        sc.close();
    }
}