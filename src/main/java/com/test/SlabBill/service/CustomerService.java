package com.test.SlabBill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.SlabBill.model.Customer;
import com.test.SlabBill.repository.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;
    
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
    // Other methods for customer operations
}
