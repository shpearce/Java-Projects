package com.lq.bank.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lq.bank.services.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	/*
	 * checking => 1 savings => 2 salary => 3 credit => 4
	 */
	
	@Autowired
	private AccountService accountService;

	@GetMapping
	public List<Map> listAllAccounts() {
		return accountService.getAllAccounts();
	}

	@GetMapping("/{id}")
	public List<Map> getAccountInfo() {
		return accountService.getAccountInfo();
	}

	
	@PutMapping("/{id}")
	public String updateAccount() {
		return "soon-update";
	}
	
	@DeleteMapping("/{id}")
	public String deleteAccount() {
		return "soon-update";
	}
	
	@PostMapping
	public String createAccount() {
		return "soon-update";
	}
	
	@PostMapping("/{id}/deposit")
	public String depositAccount() {
		return "soon-update";
	}
	
	@PostMapping("/{id}/withdrawal")
	public String wthdrawalAccount() {
		return "soon-update";
	}

}