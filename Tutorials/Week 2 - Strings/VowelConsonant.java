import java.util.Scanner;
public class VowelConsonant { 
    // Method to count vowels and consonants
    void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
            else if (ch != ' ') consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    
 public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        VowelConsonant obj = new VowelConsonant();

        // Taking the User Input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        obj.countVowelsAndConsonants(text);
        sc.close();
    }
}

