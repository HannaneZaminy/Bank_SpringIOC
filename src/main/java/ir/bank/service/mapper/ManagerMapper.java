package ir.bank.service.mapper;

import ir.bank.data.domains.Manager;
import ir.bank.dto.ManagerDto;

public interface ManagerMapper {
    public Manager toManager(ManagerDto managerDto);
    public ManagerDto toManagerDto(Manager manager);

}
