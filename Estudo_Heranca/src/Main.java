import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Account account = new Account(1001, "Vitor", 1000.0);
    account.withdraw(200.0);
    IO.println(account.getBalance());

    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
    acc2.withdraw(200.0);
    IO.println(acc2.getBalance());

    Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
    acc3.withdraw(200.0);
    IO.println(acc3.getBalance());


}
