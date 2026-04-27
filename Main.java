import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        
        System.out.print("Enter PIN: ");
        int p = sc.nextInt();
        
        if (acc.checkPin(p)) {
            ATMOperations atm = new ATMOperations();
            atm.menu(acc);
        } else {
            System.out.println("Wrong PIN");
        }
    }
}