package com.accenture.testaccenture.dao;

import com.accenture.testaccenture.domain.Franchise;
import org.springframework.data.repository.CrudRepository;

public interface IFranchiseDao extends CrudRepository<Franchise, Long> {
}
