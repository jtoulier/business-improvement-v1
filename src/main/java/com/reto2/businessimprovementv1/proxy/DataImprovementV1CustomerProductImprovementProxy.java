package com.reto2.businessimprovementv1.proxy;

import com.reto2.businessimprovementv1.dto.request.CustomerProductImprovementRequest;
import com.reto2.businessimprovementv1.dto.response.CustomerProductImprovementResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "data-improvement-v1-customer-product-improvement", url = "${data-improvement-v1.url}")
public interface DataImprovementV1CustomerProductImprovementProxy {
    @GetMapping("/customer-product-improvement")
    CustomerProductImprovementResponse save(CustomerProductImprovementRequest customerProductImprovementRequest);
}
