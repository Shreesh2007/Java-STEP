import java.util.Scanner;
public class TransactionReference {
    // Method to normalize the transaction reference
    String normalizeReference(String raw) {
        raw = raw.trim();
        if (raw.length() >= 3) {
            raw = raw.substring(0, 3).toUpperCase()
                    + raw.substring(3);
        }
        return raw;
    }

    String validateAndFormat(String reference) {
        if (reference.length() != 14) return "Invalid: wrong length";
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) return "Invalid: Bank code must be 3 letters";
        }
        for (int i = 3; i < reference.length(); i++) {
            if (!Character.isDigit(reference.charAt(i))) return "Invalid: body must contain only digits";
        }
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9);
        String formattedDate = date.substring(0, 2)
                + "/" + date.substring(2, 4)
                + "/" + date.substring(4, 6);

        StringBuilder result = new StringBuilder();
        result.append("[");
        result.append(reference.substring(0, 3));
        result.append("] DATE: ");
        result.append(formattedDate);
        result.append(" | SEQ: ");
        result.append(sequence);
        return result.toString();
    }


    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        TransactionReference obj = new TransactionReference();

        // Taking the User Input
        System.out.print("Enter transaction reference: ");
        String raw = sc.nextLine();
        String reference = obj.normalizeReference(raw);
        String result = obj.validateAndFormat(reference);
        System.out.println(result);
        sc.close();
    }
}