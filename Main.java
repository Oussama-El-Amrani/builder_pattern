import model.AccountType;
import model.BankAccount;
import model.Director;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = Director.accountBuilder()
            .accountId(2)
            .currency("kk")
            .balance(33)
            .type(AccountType.SAVING_ACCOUNT)
            .build();
        System.out.println(bankAccount);
    }
}