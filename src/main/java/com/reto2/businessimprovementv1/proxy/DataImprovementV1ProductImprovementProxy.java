package com.reto2.businessimprovementv1.proxy;

import com.reto2.businessimprovementv1.dto.response.ProductImprovementResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "data-improvement-v1-product-improvement", url = "${data-improvement-v1.url}")
public interface DataImprovementV1ProductImprovementProxy {

    @GetMapping("/product/{tio-aux}/product-improvement")
    List<ProductImprovementResponse> findByTioAux(
            @PathVariable("tio-aux") String tioAux
    );

    @GetMapping("/product-improvement/{product-improvement-id}")
    ProductImprovementResponse findByProductImprovementId(
            @PathVariable("product-improvement-id") Integer productImprovementId
    );
}
