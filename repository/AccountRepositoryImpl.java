package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.BankAccount;

public class AccountRepositoryImpl implements AccountRepository {
    private Map<Long, BankAccount> bankAccountMap = new HashMap();
    private long accountsCount = 0;

 
    @Override
    public BankAccount save(BankAccount BankAccount) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<BankAccount> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return bankAccountMap.values()
            .stream()
            .filter(predicate)
            .collect(
                Collectors.toList()
            );
    }

    @Override
    public BankAccount update(BankAccount account) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteBuId(Long id) {
        // TODO Auto-generated method stub
        
    }

    public Map<Long, BankAccount> getBankAccountMap() {
        return bankAccountMap;
    }

    public void setBankAccountMap(Map<Long, BankAccount> bankAccountMap) {
        this.bankAccountMap = bankAccountMap;
    }

    
}
