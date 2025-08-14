package Task3.ATMInterface;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(6000);  //starting balance ₹6000

        System.out.println("===== Welcome to the ATM machine =====");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw money");
            System.out.println("2.deposit money");
            System.out.println("3. check balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice) {
            case 1:
                System.out.println("Enter amount to withdraw: ₹");
                double withdrawAmount = sc.nextDouble();
                userAccount.withdraw(withdrawAmount);
                break;
            case 2:
                System.out.println("Enter amount to deposit: ₹");
                double depositAmount = sc.nextDouble();
                userAccount.deposit(depositAmount);
                break;
                case 3:
                    System.out.println("Your current balance is: ₹" + userAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
