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

public class TestAccount{
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
        System.out.println("===============================================");
        System.out.println("GLOBAL DIGITAL BANK - ACCOUNT TEST");
        System.out.println("===============================================");
        System.out.println(">>> 1. Creating Account");
        System.out.println("Account created successfully!");
        System.out.println("Account #" + account.getAccountNumber() + "|" + account.getName() + " (" + account.getAge() + "yrs)" + "|" + account.getAccountType() + "|" + "INR " + account.getBalance() + "|" + account.getStatus());
        
        System.out.println(">>> 2. Deposit Money");
        System.out.println("Enter Amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Depositing: " + depositAmount + " | Status: " 
        + (depositAmount > 0 ? "SUCCESSFUL" : "INVALID AMOUNT"));
        System.out.println("New Balance: INR " + account.getBalance());

        System.out.println(">>> 3. Withdraw Money");
        System.out.println("Enter Amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Withdrawing: " + withdrawAmount + " | Status: " 
        + (account.getBalance() >= withdrawAmount ? "SUCCESSFUL" : "INSUFFICIENT BALANCE"));
        System.out.println("New Balance: INR " + account.getBalance());

        System.out.println(">>> 4. Creating Another Account");
        System.out.println("Enter your account number: ");
        int accountnumber2 = sc.nextInt();
        System.out.println("Enter your name: ");  
        String name2 = sc.next();
        System.out.println("Enter your age: ");
        int age2 = sc.nextInt();
        System.out.println("Enter your initial balance: ");
        double initialBalance2 = sc.nextDouble();
        System.out.println("Enter your account type: ");
        String accountType2 = sc.next();
        Account account2 = new Account(accountnumber2, name2, age2, initialBalance2, accountType2);
        System.out.println("Account created successfully!");
        System.out.println("Account #" + account2.getAccountNumber() + "|" + account2.getName() + " (" + account2.getAge() + ")" + "|" + account2.getAccountType() + "|" + "INR" + account2.getBalance() + "|" + account2.getStatus());

        System.out.println(">>> 5. All Accounts Summary");
        System.out.println("Account #" + account.getAccountNumber() + "|" + account.getName() + " (" + account.getAge() + ")" + "|" + account.getAccountType() + "|" + "INR" + account.getBalance() + "|" + account.getStatus());
        System.out.println("Account #" + account2.getAccountNumber() + "|" + account2.getName() + " (" + account2.getAge() + ")" + "|" + account2.getAccountType() + "|" + "INR" + account2.getBalance() + "|" + account2.getStatus());

        System.out.println("===============================================");
        System.out.println("TEST COMPLETED!");
        System.out.println("===============================================");
        sc.close();
    }
};