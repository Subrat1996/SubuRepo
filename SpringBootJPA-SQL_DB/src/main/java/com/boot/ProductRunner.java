package com.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	ProductRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Product(10,"oil",110.50));
		repo.save(new Product(11,"chocolate",110.50));
		repo.save(new Product(12,"bread",145.50));
	}

}
