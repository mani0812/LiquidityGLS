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

import com.citi.gce.gls.dao.LiquiditySharingAccountSetupRepository;
import com.citi.gce.gls.entities.LiquiditySharingAccountSetup;

@RestController
public class LiquiditySharingAccountSetupController 
{
	@Autowired
	LiquiditySharingAccountSetupRepository lsasRepo;
	
	@GetMapping("/liquiditySharingAccountSetup")
	public List<LiquiditySharingAccountSetup> getLiquiditySharingAccountSetup()
	{
		return lsasRepo.findAll();
	}
	
	@RequestMapping("/liquiditySharingAccountSetup/{serial_number}")
	public Optional<LiquiditySharingAccountSetup> getLiquiditySharingAccountSetup(@PathVariable("serial_number") Long serial_number)
	{
		return lsasRepo.findById(serial_number);
	}

	@PostMapping(path="/liquiditySharingAccountSetup")
	public LiquiditySharingAccountSetup addLiquiditySharingAccountSetup(@RequestBody LiquiditySharingAccountSetup lsas)
	{
		lsasRepo.save(lsas);
		return lsas;
	}
	
	@DeleteMapping("/liquiditySharingAccountSetup/{serial_number}")
	public String deleteEmployee(@PathVariable Long serial_number)
	{
		LiquiditySharingAccountSetup lsas = lsasRepo.getOne(serial_number);
		lsasRepo.delete(lsas);
		return "Deleted";
	}
	
	@PutMapping("/liquiditySharingAccountSetup")
	public LiquiditySharingAccountSetup updateLiquiditySharingAccountSetup(@RequestBody LiquiditySharingAccountSetup lsas)
	{
		lsasRepo.save(lsas);
		return lsas;
	}
}
