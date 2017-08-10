package com.realdolmen.candyshop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.realdolmen.candyshop.domain.Person;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AbstractPersistenceTest {
    private static EntityManagerFactory emf;

    protected EntityManager em;

    @BeforeClass
    public static void initializeEntityManagerFactory() {
        emf = Persistence.createEntityManagerFactory("CandyShopPersistenceUnit");
    }

    @Before
    public void initializeEntityManagerWithTransaction() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    @After
    public void rollbackTransactionAndCloseEntityManager() {
        if(em != null) {
            em.getTransaction().rollback();
            em.close();
        }
    }

    @AfterClass
    public static void destroyEntityManagerFactory() {
        if(emf != null) {
            emf.close();
        }
    }
}
