package com.accenture.testaccenture.service;

import com.accenture.testaccenture.dao.IFranchiseDao;
import com.accenture.testaccenture.domain.Franchise;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranchiseServiceImpl implements IFranchiseService {
    @Autowired
    private IFranchiseDao franchiseDao;
    @Override
    @Transactional
    public void saveFranchise(Franchise franchise) {franchiseDao.save(franchise);}

}
