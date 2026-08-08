import java.util.Scanner;
public class FileExtensionValidator {
    // Method to validate file extension
    String validateFileExtension(String filename) {
        int dotPosition = filename.lastIndexOf('.');
        if (dotPosition == -1) return "Rejected: invalid file type";
        String extension = filename.substring(dotPosition + 1);
        if (extension.equalsIgnoreCase("pdf") ||
            extension.equalsIgnoreCase("docx") ||
            extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        }
        return "Rejected: invalid file type";
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        FileExtensionValidator obj = new FileExtensionValidator();

        // Taking the User Input
        System.out.print("Enter filename: ");
        String filename = sc.nextLine();
        String result = obj.validateFileExtension(filename);
        System.out.println(result);

        sc.close();
    }
}