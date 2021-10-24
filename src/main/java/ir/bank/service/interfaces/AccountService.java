package ir.bank.service.interfaces;

import ir.bank.data.domains.AccountType;
import ir.bank.dto.AccountDto;
import ir.bank.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    AccountType getAccountType(String input);
    void saveAccount(AccountDto accountDto);

    List<AccountDto> cityAccount(String city, Double min, Double max) throws Exception;
    Optional<AccountDto> getAccountByAccountNumber(Long AccountNumber) throws Exception;
    Optional<AccountDto> getAccountByAmount(Double amount);
    void update(AccountDto accountDto) throws Exception;
    void createAccountsForUser(String[] splitLine , AccountDto accountDto, UserDto user) throws Exception;
    void printAccounts(String[] splitLine) throws Exception;
}
