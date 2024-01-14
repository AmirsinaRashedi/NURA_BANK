package ir.nura_bank.mapper;

import ir.nura_bank.domain.Card;
import ir.nura_bank.domain.dto.CardDto;

public class CardMapper {

    public static CardDto cardToCardDto(Card card) {
        CardDto cardDto = new CardDto();
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setAccount(AccountMapper.cardAccountToAccountDto(card.getAccount()));
        return cardDto;
    }

    public static CardDto accountCardToCardDto(Card card) {
        CardDto cardDto = new CardDto();
        cardDto.setCardNumber(card.getCardNumber());
        return cardDto;
    }

    public static Card cardDtoToCard(CardDto cardDto) {
        Card card = new Card();
        card.setCardNumber(cardDto.getCardNumber());
        card.setAccount(AccountMapper.accountDtoToAccount(cardDto.getAccount()));
        return card;
    }


}
