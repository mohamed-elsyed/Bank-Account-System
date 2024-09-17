import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccountManagmentSystem bank = new BankAccountManagmentSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1.Creat Account..
                    2.Deposit
                    3.Withdraw
                    4.Check Balance
                    5.Exit
                    Enter your choice:
                    """
            );
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter your Account Number");
                    String accountNumber = scanner.nextLine();
                    bank.creatAccount(accountNumber);
                    break;

                case 2:
                    System.out.println("Enter your Account Number");
                    accountNumber = scanner.nextLine();
                    System.out.println("Enter amount to deposit");
                    double depositAmont = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmont);
                    break;
                case 3:
                    System.out.println("Enter your Account Number");
                    accountNumber = scanner.nextLine();
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(accountNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.println("Enter your Account Number");
                    accountNumber = scanner.nextLine();
                    bank.checkBalance(accountNumber);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}
//By me