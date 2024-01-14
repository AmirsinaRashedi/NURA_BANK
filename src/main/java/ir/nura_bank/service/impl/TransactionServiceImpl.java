package ir.nura_bank.service.impl;

import ir.nura_bank.base.service.impl.BaseServiceImpl;
import ir.nura_bank.domain.Account;
import ir.nura_bank.domain.Transaction;
import ir.nura_bank.repository.TransactionRepository;
import ir.nura_bank.service.TransactionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class TransactionServiceImpl extends BaseServiceImpl<Transaction, Long, TransactionRepository>
        implements TransactionService {

    public TransactionServiceImpl(TransactionRepository repository) {
        super(repository);
    }

    @Override
    public List<Transaction> findAllByReceiverOrSender(Account receiver, Account sender) {
        return repository.findAllByReceiverOrSender(receiver, sender);
    }

    @Override
    public List<Transaction> findAllByReceiverOrSenderAndTime(Account receiver, Account sender, LocalDateTime time) {
        return repository.findAllByReceiverOrSenderAndTime(receiver, sender, time);
    }
}
