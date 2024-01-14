package ir.nura_bank.domain;

import ir.nura_bank.base.domain.BaseEntity;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = User.TABLE_NAME)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Maker extends BaseEntity<Long> {

    public static final String TABLE_NAME = "maker";

    private String name;

    @Column(nullable = false)
    private Boolean active = false;

}
