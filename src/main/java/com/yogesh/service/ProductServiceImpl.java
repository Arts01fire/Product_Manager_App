package com.yogesh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yogesh.pojo.Product;
import com.yogesh.repo.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService {
	
	
	public ProductRepo repo;
	
		public ProductServiceImpl(ProductRepo repo) {
		this.repo = repo;
	}

	@Override
	public List<Product> listAll() {
		
		return repo.findAll();
	}

	@Override
	public void save(Product product) {
		repo.save(product);

	}

	@Override
	public Product get(Long productId) {
		
		return repo.findById(productId).get();
	}

	@Override
	public void delete(Long productId) {
		repo.deleteById(productId);
	}

}
