package ir.nura_bank.domain;

import ir.nura_bank.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = Card.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Card extends BaseEntity<Long> {

    public static final String TABLE_NAME = "card";

    @Column(unique = true, nullable = false)
    private String cardNumber;

    @OneToOne(fetch = FetchType.EAGER)
    private Account account;

}
