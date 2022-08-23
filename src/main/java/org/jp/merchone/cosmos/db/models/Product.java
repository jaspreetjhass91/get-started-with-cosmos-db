package org.jp.merchone.cosmos.db.models;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import lombok.Data;

@Data
@Container(autoCreateContainer = false, containerName = "products")
public class Product {

	@Id
	private String productId;
	private String productName;
	@PartitionKey
	private String productCategory;
	
}
