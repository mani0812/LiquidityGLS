package com.citi.gce.gls.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.gce.gls.dao.AccountRepository;
import com.citi.gce.gls.entities.Account;

@RestController
public class AccountController 
{
	@Autowired
	AccountRepository accRepo;

	@GetMapping("/account")
	public List<Account> getAccount()
	{
		return accRepo.findAll();
	}
	
	@RequestMapping("/account/{account_id}")
	public Optional<Account> getAccount(@PathVariable("account_id") String account_id)
	{
		return accRepo.findById(account_id);
	}

	@PostMapping(path="/account")//, consumes= {"application/json"}) //To restrict the data format send from client
	public Account addAccount(@RequestBody Account acc)
	{
		acc.setAccount_id(acc.getAccount_number(), acc.getBranch_code(), acc.getCurrency(), acc.getBic());
		System.out.println(acc);
		accRepo.save(acc);
		return acc;
	}
	
	@DeleteMapping("/account/{account_id}")
	public String deleteEmployee(@PathVariable String account_id)
	{
		Account acc = accRepo.getOne(account_id);
		accRepo.delete(acc);
		return "Deleted";
	}
	
	@PutMapping("/account")
	public Account updateAccount(@RequestBody Account acc)
	{
		accRepo.save(acc);
		return acc;
	}
}
