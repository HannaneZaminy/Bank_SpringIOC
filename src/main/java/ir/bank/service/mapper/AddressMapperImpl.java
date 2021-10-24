package ir.bank.service.mapper;

import ir.bank.data.domains.Address;
import ir.bank.dto.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapperImpl implements AddressMapper {
    @Override
    public Address toAddress(AddressDto addressDto) {
        return new Address().setCity(addressDto.getCity())
                .setStreet(addressDto.getStreet())
                .setAlley(addressDto.getAlley());
    }

    @Override
    public AddressDto toAddressDto(Address address) {
        return new AddressDto().setCity(address.getCity())
                .setStreet(address.getStreet())
                .setAlley(address.getAlley());
    }
}
