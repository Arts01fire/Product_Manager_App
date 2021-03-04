package com.yogesh.service;

import java.util.List;

import com.yogesh.pojo.Product;

public interface ProductService {
	
	
	public List<Product> listAll();
	
	public void save(Product product);
	
	
	public Product get(Long productId);
	
	public void delete(Long productId);

}
