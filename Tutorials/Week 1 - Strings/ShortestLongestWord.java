import java.util.Scanner;
public class ShortestLongestWord {
        String[] findShortestAndLongestWord(String text) {
            String[] words = text.split("\\s+");
            String shortest = words[0];
            String longest = words[0];

            for (int i = 1; i < words.length; i++) {
                if (words[i].length() < shortest.length()) shortest = words[i];
                if (words[i].length() > longest.length()) longest = words[i];
            }
            return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        ShortestLongestWord obj = new ShortestLongestWord();

        // Taking the User Input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Finding the shortest and longest words
        String[] result = obj.findShortestAndLongestWord(text);
        System.out.println("Shortest Word: \"" + result[0] + "\" (" + result[0].length() + ")");
        System.out.println("Longest Word: \"" + result[1] + "\" (" + result[1].length() + ")");
        sc.close();
    }
}