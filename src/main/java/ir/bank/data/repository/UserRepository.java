package ir.bank.data.repository;

import ir.bank.data.domains.User;

import java.util.Optional;

public interface UserRepository {
    void create(User user);
    Optional<User> get(String emailAddress);

    void update(User user);

}
