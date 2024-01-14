package ir.nura_bank.mapper;

import ir.nura_bank.domain.Account;
import ir.nura_bank.domain.dto.AccountDto;

public class AccountMapper {

    public static AccountDto accountToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setBalance(account.getBalance());
        accountDto.setCard(CardMapper.cardToCardDto(account.getCard()));
        return accountDto;
    }

    public static AccountDto cardAccountToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setBalance(account.getBalance());
        return accountDto;
    }

    public static Account accountDtoToAccount(AccountDto accountDto) {
        Account account = new Account();
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setBalance(accountDto.getBalance());
        account.setCard(CardMapper.cardDtoToCard(accountDto.getCard()));
        return account;
    }


}
