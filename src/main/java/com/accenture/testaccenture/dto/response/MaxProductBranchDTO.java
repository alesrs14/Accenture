package com.accenture.testaccenture.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MaxProductBranchDTO {
    private String branchName;
    private String productName;
    private Long stock;
}
