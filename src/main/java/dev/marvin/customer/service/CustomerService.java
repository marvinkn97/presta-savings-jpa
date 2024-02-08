package dev.marvin.customer.service;

import dev.marvin.customer.dto.CustomerRegistrationRequest;

public interface CustomerService {
    public String registerCustomer(CustomerRegistrationRequest customerRegistrationRequest);
}
