import java.util.Scanner;
class Account{
    private int accountNumber;
    private String name;
    private int age;
    private double balance;
    private String accountType;
    private String status;

    Account(int accountNumber, String name, int age, double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.age = age;
        this.balance = initialBalance;
        this.accountType = accountType;
        this.status = "Active";
    }

    public boolean deposit(double amount){
        if(amount <= 0){
            System.out.println("Deposit amount must be greater than zero.");
            return false;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
        return true;
    }

    public boolean withdraw(double amount){
        if(amount <= 0 || amount > balance){
            System.out.println("Withdrawal amount must be greater than zero and less than or equal to the current balance.");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
        return true;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountType() {
        return accountType;
    }
    public String getStatus() {
        return status;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
};

public class mainAccount{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account number: ");
        int accountnumber = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.println("Enter your account type: ");
        String accountType = sc.next();

        Account account = new Account(accountnumber, name, age, initialBalance, accountType);
        
        System.out.println("Account created successfully!");
        System.out.println("Enter Amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        
        System.out.println("Enter Amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Name: " + account.getName());
        System.out.println("Age: " + account.getAge());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Status: " + account.getStatus());
        
        System.out.println("Enter new name: ");
        String newName = sc.next();
        account.setName(newName);
        
        System.out.println("Enter new age: ");
        int newAge = sc.nextInt();  
        account.setAge(newAge);
        sc.close();
    }
};