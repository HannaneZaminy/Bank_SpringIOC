package ir.bank.web;

import ir.bank.dto.AccountDto;
import ir.bank.service.interfaces.AccountService;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public void saveAccount(AccountDto accountDto){
        accountService.saveAccount(accountDto);
    }
    public List<AccountDto> cityAccount(String city, Double min, Double max) throws Exception {
        return accountService.cityAccount(city,min,max);
    }
}
