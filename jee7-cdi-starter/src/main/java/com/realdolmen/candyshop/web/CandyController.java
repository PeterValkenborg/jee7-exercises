package com.realdolmen.candyshop.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import com.realdolmen.candyshop.services.CandyService;

@RequestScoped
public class CandyController {

	@Inject
    private CandyService candyService;

	
    public CandyService getCandyService() {
		return candyService;
	}


	public void setCandyService(CandyService candyService) {
		this.candyService = candyService;
	}


	public void findAllCandy() {
		// TODO Auto-generated method stub
		
	}


	public void findCandyByColor() {
		// TODO Auto-generated method stub
		
	}
    
    
}
