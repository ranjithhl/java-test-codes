package com.test.SlabBill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.SlabBill.model.PriceSlab;
import com.test.SlabBill.repository.PriceSlabRepository;

@Service
public class PriceSlabService {
    
    @Autowired
    private PriceSlabRepository priceSlabRepository;
    
    public PriceSlab addPriceSlab(PriceSlab priceSlab) {
        return priceSlabRepository.save(priceSlab);
    }
    
    // Other methods for price slab operations
}
