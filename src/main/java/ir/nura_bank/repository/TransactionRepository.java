package ir.nura_bank.repository;

import ir.nura_bank.base.repository.BaseRepository;
import ir.nura_bank.domain.Account;
import ir.nura_bank.domain.Transaction;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionRepository extends BaseRepository<Transaction, Long> {

    List<Transaction> findAllByReceiverOrSender(Account receiver, Account sender);

    List<Transaction> findAllByReceiverOrSenderAndTime(Account receiver, Account sender, LocalDateTime time);


}
