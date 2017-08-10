package com.realdolmen.candyshop.services;

import javax.inject.Inject;

import com.realdolmen.candyshop.repositories.PersonRepository;
import com.realdolmen.candyshop.web.PersonController;


public class PersonService {
	
	@Inject
	private PersonRepository personRepository;

	public void findPersonById(int i) {
		// TODO Auto-generated method stub
		
	}

	public PersonRepository getPersonRepository() {
		return personRepository;
	}

}
