package dev.service;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;

import dev.dao.IPlatDao;




public class PlatServiceVersion1Test {
	
	private PlatServiceVersion1 platService;
	IPlatDao dao;
	
	@BeforeEach 
	void setUp() {
		dao = mock(IPlatDao.class);
		platService = new PlatServiceVersion1(dao);
	}
	
	@Test
	void ajouterPlatNomInvalide() {
		Throwable thrown = null;
		try {
			platService.ajouterPlat("test", Integer.valueOf(10));
		}catch (Exception e) {
			thrown = e;
		}
	}
	

}
