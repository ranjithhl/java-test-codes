package com.test.SlabBill.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.SlabBill.model.MonthlyReading;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/reading")
@Api(value = "Monthly Reading Management System", description = "Operations pertaining to monthly reading in Reading Management System")
public class MonthlyReadingController {

    @PostMapping("/record")
    @ApiOperation(value = "Record monthly reading")
    public String recordMonthlyReading(@RequestBody MonthlyReading reading) {
        // Implementation
        return "Monthly reading recorded successfully";
    }
}
