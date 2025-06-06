package com.accenture.testaccenture.service;

import com.accenture.testaccenture.dao.IFranchiseDao;
import com.accenture.testaccenture.domain.Branch;
import com.accenture.testaccenture.domain.Franchise;
import com.accenture.testaccenture.domain.Product;
import com.accenture.testaccenture.dto.response.MaxProductBranchDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class FranchiseServiceImpl implements IFranchiseService {
    @Autowired
    private IFranchiseDao franchiseDao;
    @Override
    @Transactional
    public void saveFranchise(Franchise franchise) {franchiseDao.save(franchise);}
    @Override
    public List<MaxProductBranchDTO> getMaxProductBranch(Long franchiseId) {
        Franchise franchise = franchiseDao.findById(franchiseId)
                .orElseThrow(() -> new RuntimeException("Franchise not found"));

        List<MaxProductBranchDTO> result = new ArrayList<>();

        for (Branch branch : franchise.getBranches()) {
            Optional<Product> topProductOpt = branch.getProducts().stream()
                    .max(Comparator.comparing(Product::getStock));

            topProductOpt.ifPresent(product -> result.add(
                    new MaxProductBranchDTO(
                            branch.getName(),
                            product.getName(),
                            product.getStock()
                    )
            ));
        }

        return result;
    }
}
