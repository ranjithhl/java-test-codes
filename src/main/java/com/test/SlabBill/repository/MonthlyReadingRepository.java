package com.test.SlabBill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.SlabBill.model.MonthlyReading;

public interface MonthlyReadingRepository extends JpaRepository<MonthlyReading, Long> {
}
