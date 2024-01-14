package ir.nura_bank.repository;

import ir.nura_bank.base.repository.BaseRepository;
import ir.nura_bank.domain.Card;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CardRepository extends BaseRepository<Card, Long> {

    Card findByCardNumber(String cardNumber);

    @Query(value = "select c.cardNumber from Card c where c.id in (select max(ca.id) from Card ca) ")
    List<String> getTopCardNumber();

}
