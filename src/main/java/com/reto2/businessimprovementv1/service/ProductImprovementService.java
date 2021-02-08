package com.reto2.businessimprovementv1.service;

import com.reto2.businessimprovementv1.dto.response.ProductImprovementResponse;
import java.util.List;

public interface ProductImprovementService {
    List<ProductImprovementResponse> findByTioAux(String tioAux);

    ProductImprovementResponse findByProductImprovementId(Integer productImprovementId);
}
