package com.reto2.businessimprovementv1.controller;

import com.reto2.businessimprovementv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.businessimprovementv1.dto.response.CustomerProductImprovementResponse;
import com.reto2.businessimprovementv1.service.CustomerProductImprovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business-improvement-v1")
public class CustomerProductImprovementController {
    @Autowired
    private CustomerProductImprovementService customerProductImprovementService;

    @PostMapping("/customer-product-improvement")
    public ResponseEntity<CustomerProductImprovementResponse> save(
            @RequestBody CustomerProductImprovementRequest customerProductImprovementRequest
    ) {
        return new ResponseEntity<>(customerProductImprovementService.save(customerProductImprovementRequest), HttpStatus.OK);
    }
}
