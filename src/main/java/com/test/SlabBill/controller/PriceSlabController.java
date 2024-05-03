package com.test.SlabBill.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.test.SlabBill.model.PriceSlab;

@RestController
@RequestMapping("/slab")
@Api(value = "Price Slab Management System", description = "Operations pertaining to price slab in Price Slab Management System")
public class PriceSlabController {

    @PostMapping("/define")
    @ApiOperation(value = "Define price slab")
    public String definePriceSlab(@RequestBody PriceSlab slab) {
        // Implementation
        return "Price slab defined successfully";
    }
}

