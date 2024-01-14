package ir.nura_bank.mapper;

import ir.nura_bank.domain.Transaction;
import ir.nura_bank.domain.dto.TransactionDto;

import java.util.ArrayList;
import java.util.List;

public class TransactionMapper {


    public static TransactionDto transactionToTransactionDto(Transaction transaction) {
        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setAmount(transaction.getAmount());
        transactionDto.setDescription(transaction.getDescription());
        transactionDto.setReceiver(AccountMapper.accountToAccountDto(transaction.getReceiver()));
        transactionDto.setSender(AccountMapper.accountToAccountDto(transaction.getSender()));
        transactionDto.setTime(transaction.getTime());
        return transactionDto;
    }

    public static Transaction transactionDtoToTransaction(TransactionDto transactionDto) {
        Transaction transaction = new Transaction();
        transaction.setAmount(transactionDto.getAmount());
        transaction.setDescription(transactionDto.getDescription());
        transaction.setReceiver(AccountMapper.accountDtoToAccount(transactionDto.getReceiver()));
        transaction.setSender(AccountMapper.accountDtoToAccount(transactionDto.getSender()));
        transaction.setTime(transactionDto.getTime());
        return transaction;
    }

    public static List<TransactionDto> transactionListToTransactionDtoList(List<Transaction> transactionList) {
        List<TransactionDto> transactionDtoList = new ArrayList<>();
        for (Transaction i : transactionList) {
            transactionDtoList.add(transactionToTransactionDto(i));
        }
        return transactionDtoList;
    }

    public static List<Transaction> transactionDtoListToTransactionList(List<TransactionDto> transactionDtoList) {
        List<Transaction> transactionList = new ArrayList<>();
        for (TransactionDto i : transactionDtoList) {
            transactionList.add(transactionDtoToTransaction(i));
        }
        return transactionList;
    }
}
