package com.yogesh.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yogesh.pojo.Product;
import com.yogesh.service.ProductService;

@Controller
public class ProductController {
	
	private ProductService service;

	public ProductController(ProductService service) {
		
		this.service = service;
	}
	
	

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts=service.listAll();
		model.addAttribute("listProduct", listProducts);
		return "index";
	}
	@RequestMapping("/new")
	public String ShowNewProductForm(Model model ,Product product) {
		model.addAttribute("product", product);
		return "new_product";
	}
	
	@PostMapping("/save")
	public String saveProduct(@ModelAttribute("product")  Product product) {
		
		System.out.println(product);
		//model.addAttribute("product", product);
	  service.save(product);
	  
	  return "redirect:/";
	}
	
	
	
	@RequestMapping("/edit/{productId}")
	public ModelAndView showEditForm(@PathVariable(name= "productId")  Long productId) {
		
		ModelAndView mav=new ModelAndView("edit_product");
		Product product = service.get(productId);
		mav.addObject("product",product);
		return mav;
		
	}
	@RequestMapping("/delete/{productId}")
	public String deleteProductId(@PathVariable(name="productId")  Long productId) {
		service.delete(productId);
		
		return "redirect:/";
	}
}
