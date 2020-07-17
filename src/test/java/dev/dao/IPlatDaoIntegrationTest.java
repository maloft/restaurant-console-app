package dev.dao;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.*;

import dev.entite.Plat;

@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public abstract class IPlatDaoIntegrationTest {
	@Autowired
	private IPlatDao dao;

	// @Autowired
	// DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbc;

	@Test
	void listerPlatsNonVide() {
		List<Plat> resultats = dao.listerPlats();
		assertThat(resultats).isNotEmpty();
	}

	@Test
	void ajouterPlatValide() {
		dao.ajouterPlat("Gloubiboulga", 1500);

		List<Plat> resultat = jdbc.query("select * from plat where nom=? and PRIX=?",
				new Object[] { "Pizza", 200 }, new PlatRowMapper());

		assertThat(resultat).isNotEmpty();
	}
}
