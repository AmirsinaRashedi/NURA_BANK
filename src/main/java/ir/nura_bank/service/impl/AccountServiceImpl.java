package ir.nura_bank.service.impl;

import ir.nura_bank.base.service.impl.BaseServiceImpl;
import ir.nura_bank.domain.Account;
import ir.nura_bank.domain.Card;
import ir.nura_bank.repository.AccountRepository;
import ir.nura_bank.service.AccountService;
import ir.nura_bank.service.CardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AccountServiceImpl extends BaseServiceImpl<Account, Long, AccountRepository>
        implements AccountService {


    private final CardService cardService;


    public AccountServiceImpl(AccountRepository repository, CardService cardService) {
        super(repository);
        this.cardService = cardService;
    }

    @Override
    public Account findByAccountNumber(String accountNumber) {
        return repository.findByAccountNumber(accountNumber);
    }

    @Override
    public List<String> getTopAccountNumber() {
        return repository.getTopAccountNumber();
    }

    @Override
    @Transactional
    public Account getNewAccount() {

        String topAccountNumber = getTopAccountNumber().get(0);

        long l = Long.parseLong(topAccountNumber) + 1L;

        String newAccountNumber = "";

        for (int i = 0; i < (10 - String.valueOf(l).length()); i++)
            newAccountNumber = newAccountNumber.concat("0");

        newAccountNumber = newAccountNumber.concat(String.valueOf(l));

        Card newCard = cardService.getNewCard();

        Account newAccount = new Account(newAccountNumber, 0L, newCard);

        newAccount = save(newAccount);

        newCard.setAccount(newAccount);

        cardService.save(newCard);

        return newAccount;
    }


}
