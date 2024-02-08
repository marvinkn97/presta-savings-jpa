package dev.marvin.customer.controller;

import dev.marvin.customer.dto.CustomerRegistrationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @PostMapping("/register")
    public String registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){

        return null;
    }
}
