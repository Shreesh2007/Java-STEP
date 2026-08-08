import java.util.Scanner;
public class PhoneNumberMasker {
    // Method to validate and mask phone number
    String maskPhoneNumber(String phone) {
        if (phone.length() != 10) return "Invalid phone number";
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }
        String lastFour = phone.substring(6);
        StringBuilder maskedNumber = new StringBuilder("XXXXXX");
        maskedNumber.append(lastFour);
        maskedNumber.insert(6, "-");
        return maskedNumber.toString();
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        PhoneNumberMasker obj = new PhoneNumberMasker();

        // Taking the User Input
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();
        String result = obj.maskPhoneNumber(phone);
        System.out.println(result);
        sc.close();
    }
}