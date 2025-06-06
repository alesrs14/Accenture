package com.accenture.testaccenture.dao;

import com.accenture.testaccenture.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductDao extends CrudRepository<Product, Long> {
}
