package com.reto2.businessimprovementv1.service;

import com.reto2.businessimprovementv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.businessimprovementv1.dto.response.CustomerProductImprovementResponse;

public interface CustomerProductImprovementService {
    CustomerProductImprovementResponse save(CustomerProductImprovementRequest customerProductImprovementRequest);
}
