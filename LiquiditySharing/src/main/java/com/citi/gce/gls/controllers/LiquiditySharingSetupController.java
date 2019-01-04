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

import com.citi.gce.gls.dao.LiquiditySharingSetupRepository;
import com.citi.gce.gls.entities.LiquiditySharingSetup;

@RestController
public class LiquiditySharingSetupController 
{
	@Autowired
	LiquiditySharingSetupRepository lssRepo;
	
	@GetMapping("/liquiditySharingSetup")
	public List<LiquiditySharingSetup> getLiquiditySharingSetup()
	{
		return lssRepo.findAll();
	}
	
	@RequestMapping("/liquiditySharingSetup/{setup_id}")
	public Optional<LiquiditySharingSetup> getLiquiditySharingSetup(@PathVariable("setup_id") Long setup_id)
	{
		return lssRepo.findById(setup_id);
	}

	@PostMapping(path="/liquiditySharingSetup")
	public LiquiditySharingSetup addLiquiditySharingSetup(@RequestBody LiquiditySharingSetup lss)
	{
		lssRepo.save(lss);
		return lss;
	}
	
	@DeleteMapping("/liquiditySharingSetup/{setup_id}")
	public String deleteEmployee(@PathVariable Long setup_id)
	{
		LiquiditySharingSetup lss = lssRepo.getOne(setup_id);
		lssRepo.delete(lss);
		return "Deleted";
	}
	
	@PutMapping("/liquiditySharingSetup")
	public LiquiditySharingSetup updateLiquiditySharingSetup(@RequestBody LiquiditySharingSetup lss)
	{
		lssRepo.save(lss);
		return lss;
	}
}
