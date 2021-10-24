package ir.bank.service.mapper;

import ir.bank.data.domains.Address;
import ir.bank.dto.AddressDto;

public interface AddressMapper {
    Address toAddress(AddressDto addressDto);
    AddressDto toAddressDto(Address address);
}
