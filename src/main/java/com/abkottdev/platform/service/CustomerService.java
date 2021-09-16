package com.abkottdev.platform.service;

import com.abkottdev.platform.model.Customer;
import com.abkottdev.platform.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        if(customer!=null){
            customerRepository.save(customer);
        }
        return customer;
    }
}
