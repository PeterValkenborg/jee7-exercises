package com.realdolmen.candyshop.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.realdolmen.candyshop.repositories.CandyRepository;
import com.realdolmen.candyshop.repositories.PersonRepository;
import com.realdolmen.candyshop.web.CandyController;

@ApplicationScoped
public class CandyService {
	
    @Inject
    private CandyRepository candyRepository;

    @Inject
    private PersonService personService;   
    
    


	public PersonService getPersonService() {
		return personService;
	}

	public void findAllCandy() {
		// TODO Auto-generated method stub
		
	}

	public CandyRepository getCandyRepository() {
		return candyRepository;
	}

	public void setCandyRepository(CandyRepository candyRepository) {
		this.candyRepository = candyRepository;
	}


}
