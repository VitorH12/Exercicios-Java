import models.entities.Account;
import models.exceptions.DomainExcpections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    try {
        IO.println("Enter account data");
        IO.println("Number: ");
        int number = sc.nextInt();
        IO.println("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        IO.println("Initial balance: ");
        double initialBalance = sc.nextDouble();
        IO.println("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        IO.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);

        IO.println("New balance: " + account.getBalance());

    }
    catch (DomainExcpections e){

        IO.println("Withdraw error: " + e.getMessage());

    }
}
