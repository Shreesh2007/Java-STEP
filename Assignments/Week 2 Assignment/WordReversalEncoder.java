import java.util.Scanner;
public class WordReversalEncoder {
    String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder reverseWord = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) reverseWord.append(words[i].charAt(j));
            result.append(reverseWord);
            if (i != words.length - 1) result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        WordReversalEncoder obj = new WordReversalEncoder();

        // Taking the User Input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String output = obj.reverseEachWord(sentence);
        System.out.println(output);
        sc.close();
    }
}