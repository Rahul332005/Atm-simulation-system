import java.util.Scanner;

public class ATMOperations {
    void menu(Account acc) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: acc.showBalance(); break;
                case 2: 
                    System.out.print("Enter amount to deposit: ");
                    int d = sc.nextInt();
                    acc.deposit(d); 
                    break;
                case 3: 
                    System.out.print("Enter amount to withdraw: ");
                    int w = sc.nextInt();
                    acc.withdraw(w); 
                    break;
                case 4: System.out.println("Thank You"); break;
                default: System.out.println("Wrong Choice");
            }
        } while (choice != 4);
    }
}