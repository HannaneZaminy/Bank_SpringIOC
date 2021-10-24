package ir.bank.service.interfaces;

import ir.bank.dto.TransactionDto;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface TransactionService {
    void transfer(Long sourceAccountNo, Long desAccountNo, Double amount) throws Exception;

    List<TransactionDto> getTransaction(Date date, Integer max);
    void printTransactions(String[] splitLine ) throws ParseException;
}
