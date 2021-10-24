package ir.bank.web;

import ir.bank.dto.UserDto;
import ir.bank.service.interfaces.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void addUser(UserDto userDto) throws Exception {
        userService.addUser(userDto);
    }

    public void update(UserDto userDto) throws Exception {
        userService.update(userDto);
        System.out.println("user updated");

    }
}
