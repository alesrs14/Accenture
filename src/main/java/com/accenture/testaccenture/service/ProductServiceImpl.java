package com.accenture.testaccenture.service;

import com.accenture.testaccenture.dao.IBranchDao;
import com.accenture.testaccenture.dao.IFranchiseDao;
import com.accenture.testaccenture.dao.IProductDao;
import com.accenture.testaccenture.domain.Branch;
import com.accenture.testaccenture.domain.Franchise;
import com.accenture.testaccenture.domain.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IBranchDao branchDao;

    @Autowired
    private IProductDao productDao;

    @Override
    public void addProduct(Long branchId, Product product) {
        Branch branch = branchDao.findById(branchId)
                .orElseThrow(() -> new RuntimeException("Sucursal no existe"));

        product.setBranch(branch);
        productDao.save(product);
    }
    @Override
    public void deleteProduct(Long branchId, Long productId) {
        Product product = productDao.findById(productId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        if (product.getBranch() == null || !product.getBranch().getId().equals(branchId)) {
            throw new RuntimeException("Producto no esta en esta sucursal");
        }

        productDao.delete(product);
    }
    @Override
    public void updateStockProduct(Long productId, Long newStock) {
        Product product = productDao.findById(productId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        product.setStock(newStock);
        productDao.save(product);
    }
    @Override
    public void updateNameProduct(Long productId, String newName) {
        Product product = productDao.findById(productId)
                .orElseThrow(() -> new RuntimeException("producto no encontrada"));
        product.setName(newName);
        productDao.save(product);
    }
}
