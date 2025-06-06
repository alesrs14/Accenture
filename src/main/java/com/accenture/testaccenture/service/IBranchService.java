package com.accenture.testaccenture.service;

import com.accenture.testaccenture.domain.Branch;
import com.accenture.testaccenture.domain.Franchise;
import com.accenture.testaccenture.dto.response.MaxProductBranchDTO;

import java.util.List;

public interface IBranchService {
    void saveBranch(Branch branch);
    void addBranch(Long franchiseId, Branch branch);
}
