package ir.nura_bank.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {

    private String accountNumber;

    private Long balance;

    private CardDto card;
}
