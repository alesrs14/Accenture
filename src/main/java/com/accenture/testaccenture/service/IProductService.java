package com.accenture.testaccenture.service;

import com.accenture.testaccenture.domain.Product;

public interface IProductService {
    void addProduct(Long branchId, Product product);
    void deleteProduct(Long branchId, Long productId);
    void updateStockProduct(Long productId, Long newStock);
    void updateNameProduct(Long Id, String newName);

}
