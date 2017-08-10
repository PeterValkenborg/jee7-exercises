package com.realdolmen.candyshop.domain;

import com.realdolmen.candyshop.AbstractPersistenceTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityTransaction;

// TODO: use the AbstractPersistence Test
public class PersonPersistenceTest extends AbstractPersistenceTest {
    @Test
    public void personCanBeSaved(){
    	
      initializeEntityManagerFactory();
      initializeEntityManagerWithTransaction();
      Person person = new Person();
      person.setFirstName("Homer");
      person.setLastName("Simpson");
      em.persist(person);
      assertNotNull(person.getId());
    }
    
    @Test
    public void personCanBeLoaded(){
    	Person person = em.find(Person.class, 1000L);
    	assertEquals(person.getLastName(),"Doe");
    }
}
