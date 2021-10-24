package ir.bank.service.impl;

import ir.bank.service.interfaces.GeneratorService;
import org.springframework.stereotype.Service;

@Service
public class Generate4digitServiceImpl implements GeneratorService {
    @Override
    public Long crateRandomNumber() {
        long ret = (long) (Math.random() * 10000L);
        return ret;
    }

}
