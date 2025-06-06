package com.accenture.testaccenture.web;
import com.accenture.testaccenture.domain.Franchise;
import com.accenture.testaccenture.service.IFranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ControllerFranchise {

    @Autowired
    private IFranchiseService franchiseService;

    @PostMapping(value = "/savefranchise")
    public String saveFranchise(@RequestBody Franchise franchise) {
        franchiseService.saveFranchise(franchise);
        return "Franquicia guardada correctamente";
    }
}
