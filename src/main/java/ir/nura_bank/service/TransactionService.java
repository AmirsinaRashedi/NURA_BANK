package ir.nura_bank.service;

import ir.nura_bank.base.service.BaseService;
import ir.nura_bank.domain.Account;
import ir.nura_bank.domain.Transaction;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionService extends BaseService<Transaction, Long> {

    List<Transaction> findAllByReceiverOrSender(Account receiver, Account sender);

    List<Transaction> findAllByReceiverOrSenderAndTime(Account receiver, Account sender, LocalDateTime time);

}
