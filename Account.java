public class Account {
    int balance = 10000;
    int pin = 1234;

    boolean checkPin(int p) {
        return p == pin;
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    void deposit(int amt) {
        balance = balance + amt;
        System.out.println("Money Deposited");
    }

    void withdraw(int amt) {
        if (amt <= balance) {
            balance = balance - amt;
            System.out.println("Money Withdrawn");
        } else {
            System.out.println("Low Balance");
        }
    }
}