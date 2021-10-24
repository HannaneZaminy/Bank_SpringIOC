package ir.bank.data.repository;

import ir.bank.data.domains.Account;
import ir.bank.data.domains.BankTransactions;

import java.util.Date;
import java.util.List;

public interface TransactionRepository {

    void saveTransaction(Account sourceAccount, Account destAccount, Double amount);

    List<BankTransactions> getTransaction(Date date,Integer max);
}
