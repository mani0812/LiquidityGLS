package com.citi.gce.gls.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.gce.gls.dao.LiquiditySharingAccountRepository;
import com.citi.gce.gls.dao.LiquiditySharingSetupRepository;
import com.citi.gce.gls.entities.LiquiditySharingAccount;
import com.citi.gce.gls.entities.LiquiditySharingAccountId;
import com.citi.gce.gls.entities.LiquiditySharingSetup;

@RestController
public class LiquiditySharingAccountController 
{
	@Autowired
	LiquiditySharingAccountRepository lsaRepo;
	
	@PostMapping("/liquiditySharingAccount")
	public LiquiditySharingAccount addLiquiditySharingAccount(@RequestBody LiquiditySharingAccount lsa)
	{
		lsaRepo.save(lsa);
		return lsa;
	}	
		
	@GetMapping("/liquiditySharingAccount")
	public List<LiquiditySharingAccount> getLiquiditySharingAccount()
	{
		return lsaRepo.findAll();
	}
	
	@GetMapping("/liquiditySharingAccount/{lsa_id}")
	public Optional<LiquiditySharingAccount> getLiquiditySharingAccount(@PathVariable("lsa_id") LiquiditySharingAccountId lsa_id)
	{
		return lsaRepo.findById(lsa_id);
	}
}
