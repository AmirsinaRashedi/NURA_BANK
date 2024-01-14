package ir.nura_bank.mapper;

import ir.nura_bank.domain.User;
import ir.nura_bank.domain.dto.UserDto;

public class UserMapper {

    public static UserDto userToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setAccount(AccountMapper.accountToAccountDto(user.getAccount()));
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setDateOfBirth(user.getDateOfBirth());
        return userDto;
    }

    public static User userDtoToUser(UserDto userDto) {
        User user = new User();
        user.setAccount(AccountMapper.accountDtoToAccount(userDto.getAccount()));
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setDateOfBirth(userDto.getDateOfBirth());
        return user;
    }

}
