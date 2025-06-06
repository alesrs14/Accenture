package com.accenture.testaccenture.web;
import com.accenture.testaccenture.domain.Branch;
import com.accenture.testaccenture.domain.Franchise;
import com.accenture.testaccenture.service.IBranchService;
import com.accenture.testaccenture.service.IFranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class BranchController {

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
        return ResponseEntity.ok("Sucursal Guardada");
    }
    @PatchMapping("/{branchId}/updatenamebranch")
    public ResponseEntity<String> updateNameBranch(
            @PathVariable Long branchId,
            @RequestBody Branch branch
    ) {
        branchService.updateNameBranch(branchId, branch.getName());
        return ResponseEntity.ok("Nombre Sucursal actualizado");
    }
}
