import java.util.Scanner;
public class Customer {

    String validateCustomerId(String customerId) {
        if (customerId.startsWith("VIP-")) return "VIP Customer"; 
        else return "Regular Customer";
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        Customer obj = new Customer();

        // Taking the User Input
        System.out.print("Enter Customer ID: ");
        String customerId = sc.nextLine();

        String result = obj.validateCustomerId(customerId);
        System.out.println(result);

        sc.close();
    }
}