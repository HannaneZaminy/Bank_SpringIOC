package ir.bank.service.mapper;

import ir.bank.data.domains.BankTransactions;
import ir.bank.dto.TransactionDto;

public interface TransactionMapper {
    TransactionDto toTransactionDto(BankTransactions bankTransactions);
}
