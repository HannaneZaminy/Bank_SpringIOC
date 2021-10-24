package ir.bank.service.mapper;

import ir.bank.data.domains.Account;
import ir.bank.data.domains.User;
import ir.bank.dto.AccountDto;
import ir.bank.dto.UserDto;

public interface AccountUserMapper {
    Account toAccount(AccountDto accountDto);
    AccountDto toAccountDto(Account account);
    User toUser(UserDto userDto);
    UserDto toUserDto(User user);
}
