package com.test.SlabBill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.SlabBill.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
