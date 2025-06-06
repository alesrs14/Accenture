package com.accenture.testaccenture.web;
import com.accenture.testaccenture.domain.Franchise;
import com.accenture.testaccenture.dto.response.MaxProductBranchDTO;
import com.accenture.testaccenture.service.IFranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class FranchiseController {

    @Autowired
    private IFranchiseService franchiseService;

    @PostMapping(value = "/savefranchise")
    public String saveFranchise(@RequestBody Franchise franchise) {
        franchiseService.saveFranchise(franchise);
        return "Franquicia guardada";
    }
    @GetMapping("/{franchiseId}/maxproducts")
    public ResponseEntity<List<MaxProductBranchDTO>> getMaxProductBranch(
            @PathVariable Long franchiseId
    ) {
        List<MaxProductBranchDTO> result =
                franchiseService.getMaxProductBranch(franchiseId);
        return ResponseEntity.ok(result);
    }
}
