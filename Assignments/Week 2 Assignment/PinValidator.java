import java.util.Scanner;   
public class PinValidator {
    void checkPinLength(String pin){
        if (pin.length() == 4) System.out.println("PIN Length is Okay");
        else System.out.println("Invalid Pin: Must be Exactly 4 digits");
    }
    public static void main(String[] args) {
        //Creating the Objects
        Scanner sc = new Scanner(System.in);
        PinValidator obj = new PinValidator();

        // Taking the User Input
        System.out.print("Enter ATM Pin: ");
        String pin = sc.nextLine();
        obj.checkPinLength(pin);
        sc.close();
    }
}
