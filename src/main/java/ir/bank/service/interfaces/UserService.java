package ir.bank.service.interfaces;

import ir.bank.dto.UserDto;

public interface UserService {
    void addUser(UserDto userDto) throws Exception;
    UserDto getUser(String emailAddress);

    void update(UserDto userDto) throws Exception;
    void addUser(String[] splitLine,UserDto userDto) throws Exception;
}
