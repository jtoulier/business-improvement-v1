package com.reto2.businessimprovementv1.controller;

import com.reto2.businessimprovementv1.dto.response.ProductImprovementResponse;
import com.reto2.businessimprovementv1.service.ProductImprovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business-improvement-v1")
public class ProductImprovementController {

    @Autowired
    private ProductImprovementService productImprovementService;

    @GetMapping("/product-improvement/{product-improvement-id}")
    public ResponseEntity<ProductImprovementResponse> findByProductImprovementId(
        @PathVariable("product-improvement-id") Integer productImprovementId
    ) {
        return new ResponseEntity<>(productImprovementService.findByProductImprovementId(productImprovementId), HttpStatus.OK);
    }

    @GetMapping("/product/{tio-aux}/product-improvement")
    public ResponseEntity<List<ProductImprovementResponse>> findByTioAux(
        @PathVariable("tio-aux") String tioAux
    ) {
        return new ResponseEntity<>(productImprovementService.findByTioAux(tioAux), HttpStatus.OK);
    }
}
