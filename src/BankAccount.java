import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(){
        System.out.println("Введите сумму для пополнения счета: ");
        double amount = new Scanner(System.in).nextDouble();
        balance += amount;
    }

    public void withdraw(){
        System.out.println("Введите сумму для снятия средств: ");
        double amount = new Scanner(System.in).nextDouble();
        balance = checkingBalance(amount);
    }

    private double checkingBalance(double amount){
        if (balance < amount){
            System.out.println("Недостаточно средств");
        } else {
            balance -= amount;
        }
        return balance;
    }
}
