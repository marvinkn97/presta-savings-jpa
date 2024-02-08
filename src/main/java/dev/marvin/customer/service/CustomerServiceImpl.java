package dev.marvin.customer.service;

import dev.marvin.customer.dto.CustomerRegistrationRequest;
import dev.marvin.customer.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public String registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        return null;
    }
}
