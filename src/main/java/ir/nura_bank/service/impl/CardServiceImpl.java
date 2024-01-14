package ir.nura_bank.service.impl;


import ir.nura_bank.base.service.impl.BaseServiceImpl;
import ir.nura_bank.domain.Card;
import ir.nura_bank.repository.CardRepository;
import ir.nura_bank.service.CardService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CardServiceImpl extends BaseServiceImpl<Card, Long, CardRepository>
        implements CardService {


    public CardServiceImpl(CardRepository repository) {
        super(repository);
    }

    @Override
    public Card findByCardNumber(String cardNumber) {
        return repository.findByCardNumber(cardNumber);
    }

    @Override
    public List<String> getTopCardNumber() {
        return repository.getTopCardNumber();
    }

    @Override
    public Card getNewCard() {
        String topCardNumber = getTopCardNumber().get(0);

        long l = Long.parseLong(topCardNumber) + 1L;

        Card newCard = new Card();

        newCard.setCardNumber(String.valueOf(l));

        return newCard;
    }
}
