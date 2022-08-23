package org.jp.merchone.cosmos.db;

import org.jp.merchone.cosmos.db.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;

@EnableCosmosRepositories(basePackages = { "org.jp.merchone.cosmos.db.repositories" })
@SpringBootApplication
public class GetStartedWithCosmosDbApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(GetStartedWithCosmosDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.findByProductCategory("Apparel").forEach(p -> System.out.println("Product ----> " + p));
	}

}
