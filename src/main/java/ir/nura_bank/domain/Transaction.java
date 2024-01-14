package ir.nura_bank.domain;

import ir.nura_bank.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = Transaction.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction extends BaseEntity<Long> {

    public static final String TABLE_NAME = "transaction";

    @Column(nullable = false)
    private LocalDateTime time = LocalDateTime.now();

    @ManyToOne
    private Account sender;

    @ManyToOne
    private Account receiver;

    @Column(nullable = false)
    private Long amount;

    private String description;
}
