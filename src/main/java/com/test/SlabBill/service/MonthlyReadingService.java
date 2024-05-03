package com.test.SlabBill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.SlabBill.model.MonthlyReading;
import com.test.SlabBill.repository.MonthlyReadingRepository;

@Service
public class MonthlyReadingService {
    
    @Autowired
    private MonthlyReadingRepository monthlyReadingRepository;
    
    public MonthlyReading addMonthlyReading(MonthlyReading monthlyReading) {
        return monthlyReadingRepository.save(monthlyReading);
    }
    
    // Other methods for monthly reading operations
}
