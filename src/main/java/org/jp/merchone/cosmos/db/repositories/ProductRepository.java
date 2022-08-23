package org.jp.merchone.cosmos.db.repositories;

import java.util.List;

import org.jp.merchone.cosmos.db.models.Product;

import com.azure.spring.data.cosmos.repository.CosmosRepository;

public interface ProductRepository extends CosmosRepository<Product, String> {

	List<Product> findByProductCategory(String productCategory);
	
}
