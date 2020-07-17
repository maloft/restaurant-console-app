package dev.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import dev.config.JdbcTestConfig;
import dev.entite.Plat;

@ContextConfiguration(classes = { PlatDaoJdbc.class, JdbcTestConfig.class })
@ExtendWith(SpringExtension.class)
@ActiveProfiles({ "jdbc", "test" })
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class PlatDaoJdbcIntegrationTest {
	
	@Autowired
	PlatDaoJdbc platJdbc;

	@Test
	public void listerPlatsNonVide() {
		
		List<Plat> plats = platJdbc.listerPlats();
		assertThat(plats).isNotEmpty();
	}

	@Test
	public void ajouterPlatTest() {
		
		List<Plat> plats = platJdbc.listerPlats();
		platJdbc.ajouterPlat("testTest", 2000);
		List<Plat> plats2 = platJdbc.listerPlats();
		assertThat(plats.size()).isNotEqualTo(plats2.size());
	}

}