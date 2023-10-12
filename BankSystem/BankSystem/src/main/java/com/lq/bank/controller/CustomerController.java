package com.lq.bank.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lq.bank.services.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public List<Map>  listOfAllCustomers() {		
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/{id}/accounts")
	public List<Map> listAllAccounts() {
		return customerService.getAllAccounts();
	}

	@GetMapping("/{id}")
	public List<Map> getCustomerInfo( @PathVariable("id") int userId  ) {
		return customerService.getCustomerInfo();
	}

	@PostMapping
	public String createNewCustomer() {
		return "Soon Create";
	}
	
	@PutMapping("/{id}")
	public String updateCustomer() {
		return "soon-Update";
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer() {
		return "soon-Delete";
	}

}