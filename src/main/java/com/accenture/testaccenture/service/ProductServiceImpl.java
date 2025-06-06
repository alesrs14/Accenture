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

}
