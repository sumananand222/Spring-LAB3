package com.cg.controllers;

import java.io.PrintWriter;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Product;
import com.cg.services.ProductService;

@Controller
public class ProductController {
	@Autowired ProductService service;
	@GetMapping("/")
	public String populate(Model model) {
		model.addAttribute("products",service.populate());
		return "index";
	}
	@GetMapping("/showAddProductPage")
		public String showAddProductPage(Model model) {
		Product p=new Product();
		model.addAttribute("product",p);
			return "addProduct";
		}
	
	@PostMapping(value="/addProduct")
	public String showAddProductPage(Model model,@ModelAttribute("product")Product product,BindingResult result) throws InterruptedException {
		if(!result.hasErrors()) {
			System.out.println("Product Added");
			service.add(product);
			model.addAttribute("products",service.getAll());
//			String s=new String();
//			s="Product Added";
//			JOptionPane.showMessageDialog(null,"Product Added");
			return "index";
			
		}
		else {System.out.println("Some error occured: "+result.getAllErrors());
		return "addProduct";			
		}
	}
}
