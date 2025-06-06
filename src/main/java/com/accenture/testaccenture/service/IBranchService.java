package com.accenture.testaccenture.service;

import com.accenture.testaccenture.domain.Branch;
import com.accenture.testaccenture.domain.Franchise;

public interface IBranchService {
    void saveBranch(Branch branch);
    void addBranch(Long franchiseId, Branch branch);
}
