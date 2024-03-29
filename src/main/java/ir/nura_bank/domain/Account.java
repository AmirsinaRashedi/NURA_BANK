package ir.nura_bank.domain;

import ir.nura_bank.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = Account.TABLE_NAME)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account extends BaseEntity<Long> {

    public static final String TABLE_NAME = "account";

    @Column(unique = true, length = 10, nullable = false)
    private String accountNumber;

    @Column(nullable = false)
    private Long balance = 0L;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "account")
    private Card card;
}
