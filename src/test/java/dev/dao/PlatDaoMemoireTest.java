package dev.dao;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


class PlatDaoMemoireTest {
	
	private PlatDaoMemoire platDaoMemoire;
	
	
	@BeforeEach
	void setUp() {
		this.platDaoMemoire = new PlatDaoMemoire();
	}
	
	
	@Test
	void listerPlatsVideALInitialisation() {
		
		PlatDaoMemoire platDaoMemoire = new PlatDaoMemoire();
		assertTrue(platDaoMemoire.listerPlats().isEmpty());
	}
	
	
	@Test
	void ajouterPlatCasPassants() {
		
		PlatDaoMemoire platDaoMemoire = new PlatDaoMemoire();
		platDaoMemoire.ajouterPlat("test", Integer.valueOf(0));
		assertAll(() -> assertEquals("test", platDaoMemoire.listerPlats().get(0).getNom()),
				() -> assertEquals(Integer.valueOf(0), platDaoMemoire.listerPlats().get(0).getPrixEnCentimesEuros()));
		
	}
}