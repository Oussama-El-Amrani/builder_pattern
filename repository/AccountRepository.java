package repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import model.BankAccount;

public interface AccountRepository {
    BankAccount save(BankAccount BankAccount);
    List<BankAccount> findAll();
    Optional<BankAccount> findById(Long id);
    List<BankAccount> searchAccounts(Predicate<BankAccount> predicate);
    BankAccount update(BankAccount account);
    void deleteBuId(Long id);
}
