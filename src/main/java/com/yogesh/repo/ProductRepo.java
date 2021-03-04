package com.yogesh.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogesh.pojo.Product;

public interface ProductRepo extends JpaRepository<Product, Serializable> {

}
