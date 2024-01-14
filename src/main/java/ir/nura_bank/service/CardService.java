package ir.nura_bank.service;

import ir.nura_bank.base.service.BaseService;
import ir.nura_bank.domain.Card;

import java.util.List;

public interface CardService extends BaseService<Card, Long> {

    Card findByCardNumber(String cardNumber);

    List<String> getTopCardNumber();

    Card getNewCard();

}
