package ir.bank.service.impl;

import ir.bank.data.domains.Manager;
import ir.bank.data.repository.ManagerRepository;
import ir.bank.dto.ManagerDto;
import ir.bank.service.interfaces.ManagerService;
import ir.bank.service.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class ManagerServiceImpl implements ManagerService {
    private final ManagerRepository managerRepository;
    private final ManagerMapper managerMapper;

    @Autowired
    public ManagerServiceImpl(ManagerRepository managerRepository, ManagerMapper managerMapper) {
        this.managerRepository = managerRepository;
        this.managerMapper = managerMapper;
    }




    @Override
    public ManagerDto managerLogin(String username, String password) throws Exception {
        if (Objects.isNull(username)&&Objects.isNull(password))
            System.out.println("username or password is null");
        else {
            Optional<Manager> manager = managerRepository.get(username);
            if (manager.isPresent())
                return managerMapper.toManagerDto(manager.get());
            else
                throw new Exception("Manager not found");
        }
        return null;
    }
}
