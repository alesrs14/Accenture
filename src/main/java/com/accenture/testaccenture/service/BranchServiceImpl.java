package com.accenture.testaccenture.service;

import com.accenture.testaccenture.dao.IBranchDao;
import com.accenture.testaccenture.dao.IFranchiseDao;
import com.accenture.testaccenture.domain.Branch;
import com.accenture.testaccenture.domain.Franchise;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BranchServiceImpl implements IBranchService {
    @Autowired
    private IBranchDao  branchDao;
    @Autowired
    private IFranchiseDao franchiseDao;
    @Override
    @Transactional
    public void saveBranch(Branch branch) {branchDao.save(branch);}

    @Override
    @Transactional
    public void addBranch(Long franchiseId, Branch branch){
        Optional<Franchise> franchiseOptional = franchiseDao.findById(franchiseId);
        if(franchiseOptional.isPresent()){
            Franchise franchise = franchiseOptional.get();
            branch.setFranchise(franchise);
            branchDao.save(branch);
        }
    }
    @Override
    public void updateNameBranch(Long branchId, String newName) {
        Branch branch = branchDao.findById(branchId)
                .orElseThrow(() -> new RuntimeException("sucursal no encontrada"));
branch.setName(newName);
branchDao.save(branch);
    }
}
