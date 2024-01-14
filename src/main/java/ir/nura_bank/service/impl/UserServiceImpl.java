package ir.nura_bank.service.impl;

import ir.nura_bank.base.service.impl.BaseServiceImpl;
import ir.nura_bank.domain.Account;
import ir.nura_bank.domain.Role;
import ir.nura_bank.domain.User;
import ir.nura_bank.repository.UserRepository;
import ir.nura_bank.service.AccountService;
import ir.nura_bank.service.RoleService;
import ir.nura_bank.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.MultiValueMap;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepository>
        implements UserService {

    private final AccountService accountService;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository repository, AccountService accountService, RoleService roleService, PasswordEncoder passwordEncoder) {
        super(repository);
        this.accountService = accountService;
        this.roleService = roleService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User findUserBySsn(String ssn) {
        return repository.findUserBySsn(ssn);
    }

    @Override
    public List<User> findByFirstNameAndLastNameContaining(String firstName, String lastName) {

        if (firstName.isBlank())
            firstName = null;
        if (lastName.isBlank())
            lastName = null;
        return repository.findByFirstNameAndLastNameContaining(firstName, lastName);
    }

    @Override
    public User findByAccount(Account account) {
        return repository.findByAccount(account);
    }

    @Override
    public Boolean existsBySsn(String ssn) {
        return repository.existsBySsn(ssn);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return repository.existsByEmail(email);
    }


    @Override
    @Transactional
    public User createUserFromMap(MultiValueMap<String, String> data) {
        User newUser = new User();
        Account newAccount = accountService.getNewAccount();
        newUser.setAccount(newAccount);
        newUser.setEmail(data.get("email").stream().findFirst().get());
        newUser.setDateOfBirth(LocalDate.parse(data.get("dateOfBirth").stream().findFirst().get()));
        newUser.setFirstName(data.get("fname").stream().findFirst().get());
        newUser.setLastName(data.get("lname").stream().findFirst().get());
        newUser.setPassword(passwordEncoder.encode(data.get("password").stream().findFirst().get()));
        newUser.setSsn(data.get("id").stream().findFirst().get());
        Set<Role> role = new HashSet<>();
        role.add(roleService.findByName("USER"));
        newUser.setRoles(role);
        newUser = save(newUser);
        return newUser;
    }

}
