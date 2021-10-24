package ir.bank.dto;

import ir.bank.data.domains.AccountType;

public class AccountDto {

    private Integer id;

    private AccountType accountType;

    private Double amount;

    private UserDto userDto;
    private Long password;
    private Long accountNumber;

    public Integer getId() {
        return id;
    }

    public AccountDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public AccountDto setAccountType(AccountType accountType) {
        this.accountType = accountType;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public AccountDto setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public AccountDto setUserDto(UserDto userDto) {
        this.userDto = userDto;
        return this;
    }

    public Long getPassword() {
        return password;
    }

    public AccountDto setPassword(Long password) {
        this.password = password;
        return this;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public AccountDto setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", accountType=" + accountType +
                ", amount=" + amount +
                ", userDto=" + userDto +
                ", password=" + password +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
