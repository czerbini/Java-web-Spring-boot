package com.devsuperior.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.products.entities.Category;
import com.devsuperior.products.repositories.CategoryRepository;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category(1L, "Eletronics");
		Category category2 = new Category(2L, "Books");
		
		categoryRepository.save(category1);
		categoryRepository.save(category2);
		
	}

}
