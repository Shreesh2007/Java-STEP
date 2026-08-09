import java.util.Scanner;
public class CSVProductInventory {
    void parseProductInventory(String csvLine) {
        String[] fields = csvLine.split(",");
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }
        System.out.println("Product: " + fields[0] + " | SKU: " + fields[1] + " | Quantity: " + fields[2]);
    }

    public static void main(String[] args) {
        // Creating the Objects
        Scanner sc = new Scanner(System.in);
        CSVProductInventory obj = new CSVProductInventory();

        // Taking the User Input
        System.out.print("Enter product record: ");
        String csvLine = sc.nextLine();
        obj.parseProductInventory(csvLine);
        sc.close();
    }
}