package com.citi.gce.gls.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GLSController 
{
	@Autowired
	LiquiditySharingSetupController lssc;
	
	
	@PostMapping("/gls/liquiditySharingSetup/{setup_id}")
	public void saveUIDataToDB(@PathVariable("setup_id") Long setup_id)
	{
		System.out.println("Set-Up Id:"+setup_id);		
	}
	@GetMapping("/gls/liquiditySharingSetup/{setup_id}")
	public void fetchDataFromDBToUI(@PathVariable("setup_id") Long setup_id)
	{
		System.out.println("Set-Up Id:"+setup_id);		
	}
	

}
