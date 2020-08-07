package bankingdemo;

import java.util.Scanner;

/**
 * This program demonstrates abstract classes
 *
 * @author Ashika Shallow
 */
public class BankingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int choice;
        double amount;
        boolean keepGoing = true;
        Scanner kb = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount(65.14, 0.13);

        System.out.println("Your account balance is: $" + account.getBalance());

        while (keepGoing) {
            System.out.print("What would you like to do? withdraw(1), deposit(2), finish(0) ");
            choice = kb.nextInt();

            if (choice == 1) {
                System.out.print("Amount to withdraw: ");
                amount = kb.nextDouble();
                account.withdraw(amount);
            } else if(choice == 2){
                System.out.print("Amount to deposit: ");
                amount = kb.nextDouble();
                account.deposit(amount);
            } else{
                keepGoing = false;
            }            

        }

        account.monthlyProcess();

        System.out.println("Your new balance is: " + account.getBalance());
    }

}
