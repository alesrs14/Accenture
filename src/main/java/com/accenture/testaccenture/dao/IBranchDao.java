package com.accenture.testaccenture.dao;

import com.accenture.testaccenture.domain.Branch;
import com.accenture.testaccenture.domain.Franchise;
import org.springframework.data.repository.CrudRepository;

public interface IBranchDao extends CrudRepository<Branch, Long> {
}
