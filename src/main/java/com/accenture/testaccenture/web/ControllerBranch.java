package com.accenture.testaccenture.web;
import com.accenture.testaccenture.domain.Branch;
import com.accenture.testaccenture.domain.Franchise;
import com.accenture.testaccenture.service.IBranchService;
import com.accenture.testaccenture.service.IFranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerBranch {

    @Autowired
    private IBranchService branchService;
    @Autowired
    private IFranchiseService franchiseService;

    @PostMapping("/{franchiseId}/branch")
    public ResponseEntity<String> addBranchToFranchise(
            @PathVariable Long franchiseId,
            @RequestBody Branch branch
    ) {
        branchService.addBranch(franchiseId, branch);
        return ResponseEntity.ok("Branch added successfully");
    }
}
