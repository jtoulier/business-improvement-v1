package com.reto2.businessimprovementv1.service.impl;

import com.reto2.businessimprovementv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.businessimprovementv1.dto.response.CustomerProductImprovementResponse;
import com.reto2.businessimprovementv1.proxy.DataImprovementV1CustomerProductImprovementProxy;
import com.reto2.businessimprovementv1.service.CustomerProductImprovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerProductImprovementServiceImpl implements CustomerProductImprovementService {
    @Autowired
    private DataImprovementV1CustomerProductImprovementProxy dataImprovementV1CustomerProductImprovementProxy;

    @Override
    public CustomerProductImprovementResponse save(CustomerProductImprovementRequest customerProductImprovementRequest) {
        return dataImprovementV1CustomerProductImprovementProxy.save(customerProductImprovementRequest);
    }
}
