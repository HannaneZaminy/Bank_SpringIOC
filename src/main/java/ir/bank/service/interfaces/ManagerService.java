package ir.bank.service.interfaces;

import ir.bank.dto.ManagerDto;

public interface ManagerService {
    public ManagerDto managerLogin(String username, String password) throws Exception;
}
