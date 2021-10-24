package ir.bank.data.repository;

import ir.bank.data.domains.Manager;

import java.util.Optional;

public interface ManagerRepository {

    public void create(Manager manager);
    public Optional<Manager> get(String username);

}
