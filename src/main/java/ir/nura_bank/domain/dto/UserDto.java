package ir.nura_bank.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String firstName;

    private String lastName;

    private String email;

    private LocalDate dateOfBirth;

    private AccountDto account;
}
