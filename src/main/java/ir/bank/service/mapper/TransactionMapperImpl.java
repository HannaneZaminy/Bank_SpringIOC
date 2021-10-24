package ir.bank.service.mapper;

import ir.bank.data.domains.BankTransactions;
import ir.bank.dto.TransactionDto;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapperImpl implements TransactionMapper {
    @Override
    public TransactionDto toTransactionDto(BankTransactions bankTransactions) {
        return new TransactionDto().setAmount(bankTransactions.getAmount())
                .setDestinationAccountNo(bankTransactions.getDestinationAccount().getAccountNumber())
                .setSourceAccountNo(bankTransactions.getSourceAccount().getAccountNumber())
                .setTransferDate(bankTransactions.getTransferDate());
    }
}
