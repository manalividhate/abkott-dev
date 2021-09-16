package com.abkottdev.platform.controller;

import com.abkottdev.platform.model.Customer;
import com.abkottdev.platform.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/registration")
    public Customer addCustomer(@RequestBody Customer customer) {
        if (customer != null)
            customerService.saveCustomer(customer);
        return customer;
    }
}
