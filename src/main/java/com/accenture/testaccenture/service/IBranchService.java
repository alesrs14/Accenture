package com.accenture.testaccenture.service;

import com.accenture.testaccenture.domain.Branch;
import com.accenture.testaccenture.domain.Franchise;

public interface IBranchService {
    public void saveBranch(Branch branch);
    public void addBranch(Long franchiseId, Branch branch);
}
