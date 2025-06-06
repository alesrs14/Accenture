package com.accenture.testaccenture.web;

import com.accenture.testaccenture.domain.Product;
import com.accenture.testaccenture.service.IFranchiseService;
import com.accenture.testaccenture.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private IProductService productService;
    @PostMapping(value = "/{branchId}/product")
    public ResponseEntity<String> addProduct(
            @PathVariable Long branchId,
            @RequestBody Product product
    ){
        productService.addProduct(branchId, product);
        return ResponseEntity.ok("producto agregado");
    }
}
