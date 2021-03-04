package com.yogesh.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Product")
public class Product {
	@Id
	@SequenceGenerator(name="pro" , sequenceName = "product_seq_id" , allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pro")
	@Column(name="Product_Id")
	private Long productId;
	@Column(name="Product_Name")
	private String productName;
	@Column(name="Brand")
	private String brand;
	@Column(name="madeIn")
	private String madeIn;
	@Column(name="Price")
	private double price;

}
