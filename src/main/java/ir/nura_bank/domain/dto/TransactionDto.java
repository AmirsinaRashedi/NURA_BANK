package ir.nura_bank.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {

    private LocalDateTime time = LocalDateTime.now();

    private AccountDto sender;

    private AccountDto receiver;

    private Long amount;

    private String description;
}
