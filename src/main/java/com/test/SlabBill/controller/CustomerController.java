package com.test.SlabBill.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.SlabBill.model.Customer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/customer")
@Api(value = "Customer Management System", description = "Operations pertaining to customer in Customer Management System")
public class CustomerController {

    @PostMapping("/register")
    @ApiOperation(value = "Register a new customer")
    public String registerCustomer(@RequestBody Customer customer) {
        // Implementation
        return "Customer registered successfully";
    }
}
