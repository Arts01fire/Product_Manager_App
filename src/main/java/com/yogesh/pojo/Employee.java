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
	
	@Column(name="Emp_Id")
	private Long empId;
	@Column(name="Emp_Name")
	private String empName;
	@Column(name="Email")
	private String email;
	@Column(name="Address")
	private String address;
	@Column(name="Phone")
	private long phone;

}
