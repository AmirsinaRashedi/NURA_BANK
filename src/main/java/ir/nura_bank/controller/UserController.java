package ir.nura_bank.controller;

import ir.nura_bank.domain.User;
import ir.nura_bank.domain.dto.UserDto;
import ir.nura_bank.mapper.UserMapper;
import ir.nura_bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }

    @GetMapping("signup")
    public ModelAndView signup() {
        return new ModelAndView("create");
    }

    @PostMapping("signup")
    public ModelAndView performSignup(@RequestBody MultiValueMap<String, String> data) {
        if (data.get("email").stream().findFirst().isPresent() && userService.existsByEmail(data.get("email").stream().findFirst().get()) || (data.get("id").stream().findFirst().isPresent() && userService.existsBySsn(data.get("id").stream().findFirst().get())))
            return new ModelAndView("signup-failed");
        User currentUser = userService.createUserFromMap(data);
        UserDto userDto = UserMapper.userToUserDto(currentUser);
        ModelAndView modelAndView = new ModelAndView("dashboard");
        modelAndView.addObject("user", userDto);
        return modelAndView;
    }

    @GetMapping("login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @GetMapping("login-failed")
    public ModelAndView loginFailed() {
        return new ModelAndView("login-failed");
    }

    @GetMapping("user-dashboard")
    public ModelAndView dashboard(Principal principal) {
        User currentUser = userService.findUserBySsn(principal.getName());
        UserDto userDto = UserMapper.userToUserDto(currentUser);
        ModelAndView modelAndView = new ModelAndView("dashboard");
        modelAndView.addObject("user", userDto);
        return modelAndView;
    }

    @GetMapping("/user-dashboard-bill")
    public ModelAndView bill(Principal principal) {
        User currentUser = userService.findUserBySsn(principal.getName());
        UserDto userDto = UserMapper.userToUserDto(currentUser);
        ModelAndView modelAndView = new ModelAndView("dashboard-bill");
        modelAndView.addObject("user", userDto);
        return modelAndView;
    }

    @GetMapping("/user-dashboard-sim")
    public ModelAndView sim(Principal principal) {
        User currentUser = userService.findUserBySsn(principal.getName());
        UserDto userDto = UserMapper.userToUserDto(currentUser);
        ModelAndView modelAndView = new ModelAndView("dashboard-chargesim");
        modelAndView.addObject("user", userDto);
        return modelAndView;
    }

    @GetMapping("/user-dashboard-disable-account")
    public ModelAndView disableAccount(Principal principal) {
        User currentUser = userService.findUserBySsn(principal.getName());
        UserDto userDto = UserMapper.userToUserDto(currentUser);
        ModelAndView modelAndView = new ModelAndView("dashboard-disable");
        modelAndView.addObject("user", userDto);
        return modelAndView;
    }

    @GetMapping("/user-dashboard-more")
    public ModelAndView more(Principal principal) {
        User currentUser = userService.findUserBySsn(principal.getName());
        UserDto userDto = UserMapper.userToUserDto(currentUser);
        ModelAndView modelAndView = new ModelAndView("dashboard-more");
        modelAndView.addObject("user", userDto);
        return modelAndView;
    }

    @GetMapping("/user-dashboard-online-pass")
    public ModelAndView onlinePass(Principal principal) {
        User currentUser = userService.findUserBySsn(principal.getName());
        UserDto userDto = UserMapper.userToUserDto(currentUser);
        ModelAndView modelAndView = new ModelAndView("dashboard-onlinepass");
        modelAndView.addObject("user", userDto);
        return modelAndView;
    }

    @GetMapping("/user-dashboard-transfer")
    public ModelAndView transfer(Principal principal) {
        User currentUser = userService.findUserBySsn(principal.getName());
        UserDto userDto = UserMapper.userToUserDto(currentUser);
        ModelAndView modelAndView = new ModelAndView("dashboard-transfer");
        modelAndView.addObject("user", userDto);
        return modelAndView;
    }


}
