package com.accenture.testaccenture.service;

import com.accenture.testaccenture.domain.Franchise;
import com.accenture.testaccenture.dto.response.MaxProductBranchDTO;

import java.util.List;

public interface IFranchiseService {
    void saveFranchise(Franchise franchise);
    List<MaxProductBranchDTO> getMaxProductBranch(Long franchiseId);
    void updateNameFranchise(Long franchiseID, String newName);


}
