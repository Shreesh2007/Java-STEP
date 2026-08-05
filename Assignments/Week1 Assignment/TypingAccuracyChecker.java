import java.util.Scanner;
public class TypingAccuracyChecker {
    void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int firstMismatch = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } 
            else if (firstMismatch == 0) {
                firstMismatch = i;
            }
        }

        // Calculating accuracy percentage
        double accuracy = (matched * 100.0) / original.length();
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", 
                matched, original.length(), accuracy);
        if (firstMismatch == 0) System.out.println(" | No Mismatches");
        else {
            System.out.println(" | First Mismatch at position " + (firstMismatch + 1) + 
            " ('" + original.charAt(firstMismatch) + "' vs '" + typed.charAt(firstMismatch) + "')");
        }
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        TypingAccuracyChecker obj = new TypingAccuracyChecker();

        // Taking the User Inputs
        System.out.print("Enter original passage: ");
        String original = sc.nextLine();
        System.out.print("Enter typed text: ");
        String typed = sc.nextLine();

        // Checking typing accuracy
        obj.checkTypingAccuracy(original, typed);
        sc.close();
    }
}