import java.util.Scanner;
public class MovieReview {
    void classifyWordLengths(String review){
        String[] words = review.split(" ");
        int SCount = 0, MCount = 0, LCount = 0;
        for (int i=0; i<words.length; i++){
            int n = words[i].length();
            if (n<=4) SCount ++;
            else if (n<=8) MCount ++;
            else LCount++;
        }
        
        //Displaying the Result
        System.out.println("Short: " + SCount);
        System.out.println("Medium: " + MCount);
        System.out.println("Long: " + LCount);
    }
    
    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        MovieReview obj = new MovieReview();

        // Taking User Input
        System.out.print("Enter movie review: ");
        String review = sc.nextLine();
        obj.classifyWordLengths(review);
        sc.close();
    }
}
