package com.accenture.testaccenture.web;

import com.accenture.testaccenture.domain.Product;
import com.accenture.testaccenture.service.IFranchiseService;
import com.accenture.testaccenture.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping("/{branchId}/product/{productId}")
    public ResponseEntity<String> deleteProductFromBranch(
            @PathVariable Long branchId,
            @PathVariable Long productId
    ) {
        productService.deleteProduct(branchId, productId);
        return ResponseEntity.ok("Producto eliminado");
    }
    @PatchMapping("/{productId}/stock")
    public ResponseEntity<String> updateProductStock(
            @PathVariable Long productId,
            @RequestBody Product product
    ) {
        productService.updateStockProduct(productId, product.getStock());
        return ResponseEntity.ok("Stock actualizado");
    }
}
