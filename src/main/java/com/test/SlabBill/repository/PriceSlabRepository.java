package com.test.SlabBill.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.SlabBill.model.PriceSlab;

public interface PriceSlabRepository extends JpaRepository<PriceSlab, Long> {
}
