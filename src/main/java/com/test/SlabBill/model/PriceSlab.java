package com.test.SlabBill.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class PriceSlab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private Date startDate;
    private Date endDate;
    private BigDecimal slabRate;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public BigDecimal getSlabRate() {
		return slabRate;
	}
	public void setSlabRate(BigDecimal slabRate) {
		this.slabRate = slabRate;
	}
}
