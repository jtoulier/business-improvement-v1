package com.reto2.businessimprovementv1.service.impl;

import com.reto2.businessimprovementv1.dto.response.ProductImprovementResponse;
import com.reto2.businessimprovementv1.proxy.DataImprovementV1ProductImprovementProxy;
import com.reto2.businessimprovementv1.service.ProductImprovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductImprovementServiceImpl implements ProductImprovementService {
    @Autowired
    private DataImprovementV1ProductImprovementProxy dataImprovementV1ProductImprovementProxy;

    @Override
    public List<ProductImprovementResponse> findByTioAux(String tioAux) {
        return dataImprovementV1ProductImprovementProxy.findByTioAux(tioAux);
    }

    @Override
    public ProductImprovementResponse findByProductImprovementId(Integer productImprovementId) {
        return dataImprovementV1ProductImprovementProxy.findByProductImprovementId(productImprovementId);
    }
}
